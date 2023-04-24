public class BasicPlanCommissionEmployee extends  ComissionEmployee{
    private double basic;
    public void setBasic(){
        this.basic = basic;
    }

    public double getBasic(){
        return basic;
    }

    @Override
    public double Earnings() {
        return basic + super.Earnings();
    }
}
