public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal obj = new Animal();
        obj.getHeighi();
        Dog dog = new Dog();
        dog.getHeighi();
        Husky hus = new Husky();
        System.out.println("the weight is:"+hus.weight);
    }
}