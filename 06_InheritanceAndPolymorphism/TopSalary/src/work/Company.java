package work;

import java.text.CollationElementIterator;
import java.util.*;

public class Company {
    public TreeSet<Employee> staff;

    protected static double income;
    protected static double topManagerSalary;
    protected static double operatorSalary;
    protected static double managerSalary;

    public Company(double income, double topManagerSalary, double managerSalary, double operatorSalary) {
        this.income = income;
        this.topManagerSalary = topManagerSalary;
        this.managerSalary = managerSalary;
        this.operatorSalary = operatorSalary;
        staff = new TreeSet<>(new EmployeeSalaryComparator());
    }

    public TreeSet<Employee> getStaff() {
        return staff;
    }

    public void hire(Employee staff) {
        this.staff.add(staff);
    }

    public void hireAll(ArrayList<Employee> staffList) {
        staff.addAll(staffList);
    }

    public void fire_first() {
        staff.remove(staff.first());
    }

    public void fire_last() {
        staff.remove(staff.last());
    }

    public double getIncome() {
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> top = new ArrayList<>(staff);
        if (count < top.size() - 1) {
            System.out.println("TOP " + count + " salary");
            for (int i = 0; i < count; i++) {
                System.out.println("\t" + top.get(i).getMonthSalary() + " руб.");
            }
        }
        return top;
    }

    public List<Employee> getLowestSalaryStaff(int count) {

        ArrayList<Employee> lowest = new ArrayList<>(staff);
        Collections.reverse(lowest);
        if (count < lowest.size() - 1) {
            System.out.println("LOWEST " + count + " salary");
            for (int i = 0; i < count; i++) {
                System.out.println("\t" + lowest.get(i).getMonthSalary() + " руб.");
            }
        }
        return lowest;
    }


}
