package Sprint4.TCPLiveSimpleDemo.LIveTCPDistans.MultiUserExempel;

// Klienten ska läsa in text från System.in (fr användaren)
//Sen skickas texten till servern
//servern skriver ut texten på System.out

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

    Socket sock;

    public Server(Socket sock){
        this.sock = sock;
    }

    public void run() {

        String temp = "";

        try(
            PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()))
        ){
            //System.out.println("före loopen");
            while((temp=br.readLine()) != null){
                pw.println("Meddelandet är mottaget");
                System.out.println(temp);
                pw.println("Meddelandet har visats");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
