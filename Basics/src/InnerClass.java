public class InnerClass {
    int x= 24;
    public class DeeperClass {
        String y = " 32 ";

        public void printouter() {
            System.out.println(x);
        }
    }

    public static void main(){
        InnerClass ic = new InnerClass();
        System.out.println(ic.x);
    }
}
