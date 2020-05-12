import work.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Company tesla = new Company(1000000, 150000, 100000, 45000);

        for (int i = 0; i < 180; i++) {
            tesla.hire(new Operator());
        }
        for ( int i = 0; i < 80; i++){
            tesla.hire(new Manager());
        }
        for (int i = 0; i < 10; i++) {
            tesla.hire(new TopManager());
        }
        System.out.println(tesla.staff.size());
        tesla.getTopSalaryStaff(10);
        tesla.getLowestSalaryStaff(30);

        int staffCount = tesla.getStaff().size();
        int removeStaffCount = staffCount/2;
        for (int i = 0; i < removeStaffCount; i++){
            tesla.fire_first();
        }
        tesla.getTopSalaryStaff(10);
        tesla.getLowestSalaryStaff(30);

    }
}

