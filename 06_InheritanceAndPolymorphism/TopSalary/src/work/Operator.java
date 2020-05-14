package work;

public class Operator implements Employee{

    public Company company;
    public double salary;
    public  Operator(){
        this.salary = 0;
        this.company = null;
    }


    @Override
    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public void setMonthSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public double getMonthSalary(){
        return salary;
    }

}
