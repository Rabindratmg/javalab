public class Concurrency implements Runnable {


    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am thread " + Thread.currentThread().getName());
        }

    }

    public static void main(String args[]) {
            Concurrency c = new Concurrency();
            Thread thread = new Thread(c);
            thread.start();
            if (thread.isAlive()) {
                System.out.println("Waiting...");
            }


        System.out.println("I will be executed after thread execution is finished..");
    }
}