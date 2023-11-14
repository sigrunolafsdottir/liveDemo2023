package Sprint4.TCPLiveSimpleDemo.LiveDemoBasicTCPpp.ServerToClient;

//TODO: Läsa från System.in
//SKicka till server
//servern printar ut på System.out

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

        try(ServerSocket serv = new ServerSocket(port);
            Socket sock = serv.accept();
            PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()))
                ){

            while(true){
                pw.println("Message fr Server");
                temp = br.readLine();
                System.out.println(temp);
                Thread.sleep(1000);
            }
            /*while((temp = br.readLine()) != null){
                System.out.println(temp);
            }

             */


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
