package Sprint4.TCPLiveSimpleDemo.LIveTCPDistans.InitialtExempel;

// Klienten ska läsa in text från System.in (fr användaren)
//Sen skickas texten till servern
//servern skriver ut texten på System.out

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        int port = 55555;
        String temp = "";
        int i = 0;

        try(ServerSocket serv = new ServerSocket(port);
            Socket sock = serv.accept();
            PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()))
        ){
            //System.out.println("före loopen");
            while((temp=br.readLine()) != null){
                pw.println("Meddelandet är mottaget");
                System.out.println(temp);
                pw.println("Meddelandet har visats");
            }
        }

    }
}
