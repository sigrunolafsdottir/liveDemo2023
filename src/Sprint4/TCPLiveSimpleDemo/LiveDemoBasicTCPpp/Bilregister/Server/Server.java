package Sprint4.TCPLiveSimpleDemo.LiveDemoBasicTCPpp.Bilregister.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        int port = 55555;
        String temp = "";
        BilDAO database = new BilDAO();
        String answer = "";

        try(ServerSocket serv = new ServerSocket(port);
            Socket sock = serv.accept();
            PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()))
        ){

            while((temp = br.readLine()) != null){   //ta emot från klienten
                answer = database.searchCar(temp.trim());   // slå upp i databasen
                pw.println(answer);    //skicka tillbaka svar
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
