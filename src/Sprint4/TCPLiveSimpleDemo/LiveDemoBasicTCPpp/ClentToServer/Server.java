package Sprint4.TCPLiveSimpleDemo.LiveDemoBasicTCPpp.ClentToServer;

//TODO: Läsa från System.in
//SKicka till server
//servern printar ut på System.out

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

public class Server {

    public static void main(String[] args) {

        int port = 55555;
        String temp = "";

        try(ServerSocket serv = new ServerSocket(port);
            Socket sock = serv.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()))
                ){

            while((temp = br.readLine()) != null){
                System.out.println(temp);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
