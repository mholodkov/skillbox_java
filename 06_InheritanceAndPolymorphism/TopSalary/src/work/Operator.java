package work;

import java.util.Collections;

public class Operator implements Employee {
    public double salary;

    public Operator() {
        salary = Company.operatorSalary + Math.round(1000 * Math.random());
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}
