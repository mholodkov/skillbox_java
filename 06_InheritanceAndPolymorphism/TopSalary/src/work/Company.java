package work;

import org.w3c.dom.ls.LSOutput;

import java.text.CollationElementIterator;
import java.util.*;

public class Company {
    protected ArrayList<Employee> staff;

    protected static double income;
    protected static double topManagerSalary;
    protected static double operatorSalary;
    protected static double managerSalary;

    public Company(double income, double topManagerSalary, double managerSalary, double operatorSalary) {
        this.income = income;
        this.topManagerSalary = topManagerSalary;
        this.managerSalary = managerSalary;
        this.operatorSalary = operatorSalary;
        staff = new ArrayList<>();
    }

    public void hire(Employee employee) {
        staff.add(employee);
    }

    public void hireAll(ArrayList<Employee> employees) {
        staff.addAll(employees);
    }

    public void fire(int index) {
        staff.remove(index);
    }

    public double getIncome() {
        return income;
    }

    public int getStaffCount() {
        return staff.size();
    }

    public List<Employee> getTopSalaryStaff(int count) {
        List<Employee> topStaffSalary = new ArrayList<>();
        staff.sort(new EmployeeSalaryComparator());
        if (count < staff.size() - 1) {
            System.out.println("TOP " + count + " salary!");
            for (int i = 0; i < count; i++) {
                topStaffSalary.add(staff.get(i));
                System.out.println("\t" + topStaffSalary.get(i).getMonthSalary() + " руб.");
            }
        } else {
            System.out.println("Variable count is greater than the number of employees" +
                    "\n\tCount employees: " + staff.size());
        }
        return topStaffSalary;

    }


    public List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> lowestStaffSalary = new ArrayList<>();
        staff.sort(new EmployeeSalaryComparator());
        Collections.reverse(staff);
        if (count < staff.size() - 1) {
            System.out.println("LOWEST " + count + " salary!");
            for (int i = 0; i < count; i++) {
                lowestStaffSalary.add(staff.get(i));
                System.out.println("\t" + lowestStaffSalary.get(i).getMonthSalary() + " руб.");
            }
        } else {
            System.out.println("Variable count is greater than the number of employees" +
                    "\n\tCount employees: " + staff.size());
        }
        return lowestStaffSalary;
    }


}
