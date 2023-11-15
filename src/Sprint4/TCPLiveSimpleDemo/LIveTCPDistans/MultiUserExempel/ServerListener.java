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

public class ServerListener {

    public static void main(String[] args) throws IOException {

        int port = 55555;
        try (ServerSocket serv = new ServerSocket(port)) {

            while (true) {
                Socket sock = serv.accept();
                Server server = new Server(sock);
                server.start();
            }
        }
    }
}
