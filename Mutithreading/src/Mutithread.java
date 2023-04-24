public class Mutithread {
    public static void main(String[] args){
        for(int i =0; i<=8; i++){
            MutithreadingDemo mtd = new MutithreadingDemo();
            mtd.start();
        }
    }
}
