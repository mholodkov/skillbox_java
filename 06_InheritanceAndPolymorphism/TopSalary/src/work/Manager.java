package work;

public class Manager implements Employee{
    private double salary ;
    private double bonus;

    public Manager(){
        bonus = Company.income * 0.05;
        salary = Company.managerSalary + Math.round(10000 * Math.random()) * 1.1 + bonus;
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}
