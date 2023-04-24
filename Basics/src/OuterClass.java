public class OuterClass {
    private int x;

    public OuterClass(int x) {
        this.x = x;
    }

    public void printX() {
        System.out.println("X is " + x);
    }

    public class InnerClass {
        public void printOuterX() {
            System.out.println("Outer X is " + x);
        }
    }
    public static void main(String args[]){
        OuterClass oc = new OuterClass(24);
        System.out.println(oc.x);
    }
}
