public class Main {
    public static void main(String[] args) {
        process p1 = new process();
        process1 p2 = new process1();
        p1.start();
        p2.start();

    }

    static class  process extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 2; i++) {
                System.out.println("process calling....");
            }
        }
    }

    static class process1 extends Thread {
        @Override
        public void run() {

            for (int i = 0; i < 2; i++) {
                System.out.println("process 1 calling...");
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

