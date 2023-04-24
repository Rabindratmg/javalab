public class HourlyEmployee extends Employee{
    private double hour;
    private double hourlyrate;

    public void setHour(){
        this.hour= hour;
    }

    public double getHour(){
        return hour;
    }
    public void setHourlyRate(){
        this.hourlyrate = hourlyrate;

    }
    public double getHourlyRate(){
        return hourlyrate;
    }

    @Override
    public double Earnings() {
        return getHour()*getHourlyRate();
    }
}
