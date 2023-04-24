package Arrayl;

import java.util.ArrayList;

public class ArrayExample {
    public static void main(String args[]){
        ArrayList <String> name = new ArrayList<String>();
        name.add("Rabindra");
        name.add("Hari");
        for(String i: name){
            System.out.println(i);
        }
    }
}
