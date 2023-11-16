package Sprint4.MultiUserDemoPP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] args) {
        int port = 12345;
        String ip = "127.0.0.1";

        try(Socket sock = new Socket(ip, port);
            PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ){
            String temp;
            while((temp = br.readLine()) != null){
                pw.println(temp);
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }





}
