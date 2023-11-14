package Sprint4.TCPLiveSimpleDemo.LiveDemoBasicTCPpp.ServerToClient;

//TODO: Läsa från System.in
//SKicka till server
//servern printar ut på System.out

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Klient {

    public static void main(String[] args) {

        int port = 55555;
        String ip = "127.0.0.1";
        String temp = "";

        try(Socket sock = new Socket (ip, port);
            PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))){

            while((temp = br.readLine()) != null){
                System.out.println(temp);
                pw.println("Meddelande mottaget");
            }

            /*
            while((temp=userInput.readLine()) != null){
                pw.println(temp);

            }

             */

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
