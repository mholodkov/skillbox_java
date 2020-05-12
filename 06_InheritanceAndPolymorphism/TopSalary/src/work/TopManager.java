package work;

public class TopManager implements Employee {
    private double salary;

    public TopManager() {
        if (Company.income < 10000000) {
            salary = Math.round(Company.topManagerSalary + Company.topManagerSalary * Math.random());
        } else {
            salary = Math.round(Company.topManagerSalary + Company.topManagerSalary * Math.random()) * 2.5;
        }
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }

}
