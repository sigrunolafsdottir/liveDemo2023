package Sprint4.TCPLiveSimpleDemo.LIveTCPDistans;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// Klienten ska läsa in text från System.in (fr användaren)
//Sen skickas texten till servern
//servern skriver ut texten på System.out


public class Client {

    public static void main(String[] args) {

        String ip = "127.0.0.1";
        int port = 55555;
        String temp = "";

        try(Socket sock = new Socket(ip, port);
            PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader brSock = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){

            while((temp = br.readLine()) != null){
               // System.out.println("inne i loopen");
                pw.println(temp);
                String kvittens1 = brSock.readLine();
                System.out.println(kvittens1);
                String kvittens2 = brSock.readLine();
                System.out.println(kvittens2);
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
