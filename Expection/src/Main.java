public class Main {
    public static void main(String[] args) {
        String isLoading = "True....";
        try {
            int divider = 0;
            int value = 100;
            int res = value / divider;
            System.out.println("res is:" + res);
        } catch (Exception e) {
            System.out.println("error "+e);
        }finally {
            isLoading = "False";
            System.out.println("this is finally block");
        }
        anotherWork();
    }
        static void anotherWork() {
            System.out.println("another work");
        }

    }

