package work;

import java.text.CollationElementIterator;
import java.util.*;

public class Company {
    public ArrayList<Employee> staff;
    protected double income;
    protected double topManagerSalary;
    protected double operatorSalary;
    protected double managerSalary;
    protected String name;

    public Company(double income, double topManagerSalary, double managerSalary, double operatorSalary, String name) {
        this.income = income;
        if (this.income < 10000000) {
            this.topManagerSalary = topManagerSalary;
        } else {
            this.topManagerSalary = topManagerSalary * 2.5;
        }
        this.managerSalary = managerSalary + this.income * 0.05;
        this.operatorSalary = operatorSalary;
        staff = new ArrayList<>();
        this.name = name;
    }

    public void hire(Employee employee) {
        employee.setCompany(this);
        if (employee instanceof Operator) {
            employee.setMonthSalary(this.operatorSalary + Math.round(Math.random() * 1000));
        } else if (employee instanceof Manager) {
            employee.setMonthSalary(this.managerSalary + Math.round(Math.random() * 1000));
        } else if (employee instanceof TopManager) {
            employee.setMonthSalary(this.topManagerSalary + Math.round(Math.random() * 1000));
        }
        staff.add(employee);
    }

    public void hireAll(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            employee.setCompany(this);
            if (employee instanceof Operator) {
                employee.setMonthSalary(this.operatorSalary + Math.round(Math.random() * 1000));
            } else if (employee instanceof Manager) {
                employee.setMonthSalary(this.managerSalary + Math.round(Math.random() * 1000));
            } else if (employee instanceof TopManager) {
                employee.setMonthSalary(this.topManagerSalary + Math.round(Math.random() * 1000));
            }
            staff.add(employee);
        }
    }

    public void fire(int index) {
        staff.remove(index);
    }

    public int getStaffCount() {
        return staff.size();
    }

    public List<Employee> getTopSalaryStaff(int count) {
        List<Employee> topStaffSalary = new ArrayList<>();
        staff.sort((o1, o2) -> {
            if (o2.getMonthSalary() > o1.getMonthSalary()) {
                return 1;
            } else if (o2.getMonthSalary() < o1.getMonthSalary()) {
                return -1;
            }
            return 0;
        });
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
        staff.sort((o1, o2) -> {
            if (o2.getMonthSalary() > o1.getMonthSalary()) {
                return 1;
            } else if (o2.getMonthSalary() < o1.getMonthSalary()) {
                return -1;
            }
            return 0;
        });
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
