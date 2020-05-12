package work;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        if (employee.getMonthSalary() > t1.getMonthSalary()) {
            return -1;
        }
        if (employee.getMonthSalary() < t1.getMonthSalary()) {
            return 1;
        }
        return 0;
    }
}
