public class SalaryEmployee extends Employee{
    private double salary;

    public void setSalary(double salary){
        this.salary= salary;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public double Earnings() {
        return getSalary();
    }
}
