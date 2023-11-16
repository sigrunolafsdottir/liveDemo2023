package Sprint4.MultiUserDemoPP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener {


    public static void main(String[] args) throws IOException {

        int port = 12345;

        try(ServerSocket serverSocket = new ServerSocket(port)){

            while(true) {
                    Socket sock = serverSocket.accept();
                    ServerThreaded st = new ServerThreaded(sock);
                    st.start();
            }
        }
    }
}
