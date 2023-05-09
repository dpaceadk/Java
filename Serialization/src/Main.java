import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("Dipesh.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Person person=new Person();
        objectOutputStream.writeObject(person);
        FileInputStream fileInputStream = new FileInputStream("Dipesh.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person1 = (Person) objectInputStream.readObject();
        person1.getName();
        person1.getAge();
        System.out.println(person1.age);
    }
}