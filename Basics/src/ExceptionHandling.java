public class ExceptionHandling {
    public static void Run() throws ArithmeticException{
        System.out.println("Throws an error ");
        int a=10;
        if (a > 9){
            throw new ArithmeticException("A is lesser than 10");
        }
        else{
            System.out.println("a is lesser than 10");
        }
    }
    public static void main(String args[]){
        Run();
        int a=5;
        try{
            int result = a/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Excpetion block executed sucessfully");
        }
    }
}
