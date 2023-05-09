import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {

        System.out.println("Server");
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            serverSocket.accept();
            System.out.println("A new Client has Connected");
        } catch (IOException e) {
            System.out.println("Not connected");
            throw new RuntimeException(e);
        }
    }
}