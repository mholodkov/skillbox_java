package work;

import java.util.Collections;

public class Operator implements Employee {
    public double salary;
    public Operator(){
        salary = Company.operatorSalary  + Math.round(10000 * Math.random()) * 1.1;
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}
