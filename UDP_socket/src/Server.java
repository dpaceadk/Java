import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args)throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String message = "Hello world!";
        DatagramPacket packet = new DatagramPacket(message.getBytes(),message.length(), InetAddress.getByName("localhost"),12345);

        //sending packet via socket//
        System.out.println("Sending message....!!!");
        socket.send(packet);
    }
}