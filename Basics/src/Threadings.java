public class Threadings extends Thread{

    public static void main(String args[]){
        Threadings th = new Threadings();
        th.start();
        System.out.println("This code is running out of thred");
    }

    public void run(){
    System.out.println("This is running in thread");
    }
}
