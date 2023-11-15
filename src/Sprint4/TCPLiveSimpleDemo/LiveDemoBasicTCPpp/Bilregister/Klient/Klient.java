package Sprint4.TCPLiveSimpleDemo.LiveDemoBasicTCPpp.Bilregister.Klient;

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

        try (Socket sock = new Socket(ip, port);
             PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
             BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            while ((temp = userInput.readLine()) != null){

                pw.println(temp);  //skickar regnr
                temp = br.readLine();   //tar emot svar fr server
                System.out.println(temp);   //skriver ut serverns svar

            }


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
