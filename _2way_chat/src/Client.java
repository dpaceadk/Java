import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)  {
        System.out.println("Client");
        try {
            Socket socket = new Socket("localhost",12345);
            //accept socket value msg//
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader userinputReader = new BufferedReader(new InputStreamReader(System.in));//get input from user without using scanner//

            //for displaying message//
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter=new PrintWriter(outputStream,true);
            String sendingMessage,receivingMessage;
            while (true){
                //receiving message from server //
                receivingMessage =socketDataReader.readLine();
                System.out.println("Server:"+receivingMessage);

                //sending to server//
                sendingMessage = userinputReader.readLine();//get input from user//
                printWriter.println(sendingMessage);
                printWriter.flush();//clear memory crash//


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}