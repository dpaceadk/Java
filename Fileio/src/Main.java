import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Dipesh.txt");

            file.createNewFile();




        //write something on this file

            FileWriter writer = new FileWriter("Dipesh.txt");
            writer.write("I am Dipesh");
            writer.close();


            int value;
            FileReader reader = new FileReader("Dipesh.txt");
            while((value=reader.read()) !=-1){
               // char value = (char)reader.read();
                System.out.print((char)value);
            }
        reader.close();
            
       
        file.delete();
    }
}