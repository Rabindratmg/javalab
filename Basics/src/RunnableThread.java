public class RunnableThread implements Runnable{
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            RunnableThread rt = new RunnableThread();
            Thread thread = new Thread(rt);
            thread.start();
        }

    }
    public void run(){
        System.out.println("The thread" + Thread.currentThread().getId() + " is running");
    }
}
