import java.io.Serializable;

public class Person implements Serializable {
    int age= 25;
    String name ="Dipesh";
    double height =5.6;
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
