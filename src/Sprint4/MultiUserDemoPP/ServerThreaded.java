package Sprint4.MultiUserDemoPP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThreaded extends Thread {
    Socket sock;

    public ServerThreaded (Socket sock){
        this.sock = sock;
    }

    @Override
    public void run(){
        String temp;

        try(PrintWriter pw = new PrintWriter(sock.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(
                sock.getInputStream()))){

            while ((temp = br.readLine()) != null){
                System.out.println(temp);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
