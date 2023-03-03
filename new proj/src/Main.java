public class Main {
    public static void main(String[] args) {
       //System.out.println("Hello world!");
       // String x = new String();
       // Shape object = new Shape();
       // System.out.println("Width of shape : " +object.width);
      // System.out.println( "Height of shape:"+object.height);
       // object.area();
        //Shape object = new Shape(100,400);
       // Shape object2 = new Shape(400,200);
        //String name="Dipesh";
        //int a=21;
        //System.out.println("the name is:"+name+"and age is"+a+"");
        Person obj = new Person("Dipesh",21);
        obj.introduce();
       System.out.println("the name is"+obj.name);
        System.out.println("age is"+obj.age);
    }
}