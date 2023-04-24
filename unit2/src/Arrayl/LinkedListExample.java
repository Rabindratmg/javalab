package Arrayl;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String args[]){
        LinkedList<String> detail = new LinkedList<>();
        detail.add("Ram Bhadur");
        detail.add("hari krishna");
        for(String i: detail){
            System.out.println(i);
        }
    }

}
