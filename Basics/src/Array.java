import java.util.*;
public class Array {
    public static void main(String args[]){
        int[] a = {1,2,3,4,5,6};
        a[1]=10;
        System.out.println(a[1]);
        InputString();
        for (int i:a
             ) {
            System.out.print(i+"\n");
        }


    }
    public static void InputString(){
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("You name is  " + name);

    }
}
