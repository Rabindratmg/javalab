import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    static ArrayList<Student> studentArrayList=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int ch=1;
        while(ch!=0){
            addStudent();
            System.out.println("Do you want to add more::  0 to exit 1 to add");
            ch=sc.nextInt();
        }
        displayStudent();
    }
    public static void addStudent(){
        System.out.println("Enter number of students ::");
        int noOfStudents=sc.nextInt();
        for(int i=0;i<noOfStudents;i++){
            System.out.println("Enter name :: ");
            String name=sc.next();
            System.out.println("Enter roll number :: ");
            int roll=sc.nextInt();
            Student s1=new Student();
            s1.setName(name);
            s1.setRollNo(roll);
            studentArrayList.add(s1);
        }
    }
    public static void displayStudent(){
        for(Student s: studentArrayList){
            System.out.println(s);
        }
    }
}
