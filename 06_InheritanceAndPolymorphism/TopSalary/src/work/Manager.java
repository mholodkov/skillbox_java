package work;

public class Manager implements Employee{
    private double salary ;
    private double bonus;

    public Manager(){
        bonus = Company.income * 0.05;
        salary = Company.managerSalary + bonus + Math.round(1000 * Math.random());
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}
