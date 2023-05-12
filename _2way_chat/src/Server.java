import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {

        System.out.println("Server");
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket=serverSocket.accept();
            System.out.println("A new Client has Connected");
            //accept socket value message//
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader userinputReader = new BufferedReader(new InputStreamReader(System.in));//get input from user without using scanner//

            //for displaying message//
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter=new PrintWriter(outputStream,true);
            String sendingMessage,receivingMessage;
            while (true){
                //sending to client//
                sendingMessage = userinputReader.readLine();//get input from user//
                printWriter.println(sendingMessage);
                printWriter.flush();//clear memory crash//

                //receiving message from client//
                receivingMessage =socketDataReader.readLine();
                System.out.println("Client:"+receivingMessage);

            }
        } catch (IOException e) {
            System.out.println("Not connected");
            throw new RuntimeException(e);
        }
    }
}