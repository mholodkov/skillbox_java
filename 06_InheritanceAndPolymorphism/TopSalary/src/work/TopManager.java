package work;

public class TopManager implements Employee {
    public Company company;
    public double salary;

    public TopManager() {
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
