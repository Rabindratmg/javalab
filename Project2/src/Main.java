import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> Employeelist = new ArrayList<Employee>();
        SalaryEmployee s1= new SalaryEmployee();
        s1.setSalary(5000);
        System.out.println(s1.Earnings());

    }
}