public class Counter{
    public int count = 0;

    public synchronized void Increment() {
        count++;
    }

    public synchronized void getCount() {
        System.out.println(count);
    }
}
