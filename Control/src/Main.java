

public class Main {
    public static void main(String[] args)
    {
       int age = 40;
       // if(age==40){
        //System.out.println("Buy a new car");
    //}
    //else if (age == 60){
   // System.out.println("Buy an old car");
    //}
   // else{
        //System.out.println("i will retire");
  //  }
   // }

        switch(age){
            case 40:
                System.out.println("buy a car");
                break;
            case 60:
                System.out.println("buy a house");
                break;
            default:
                System.out.println("i will retire");
                break;

        }
}
}