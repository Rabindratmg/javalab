public class MutithreadingDemo extends Thread {
    public void run(){
        try{
            System.out.println(
                    "Thread " + Thread.currentThread().getName() + " is running"
            );
        }

        catch(Exception e){
            System.out.println("Excepetion is caught");
        }
    }
}
