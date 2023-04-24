public class ComissionEmployee extends Employee{
    private double rate;
    private double sales;

    public void setRate(){
        this.rate= rate;
    }

    public double getRate(){
        return rate;
    }

    public void setRage(){
        this.sales = sales;
    }

    public double getSales(){
        return sales;
    }

    @Override
    public double Earnings() {
        return getRate()*getSales();
    }
}
