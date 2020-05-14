import work.*;

public class Main {
    public static void main(String[] args) {

        Company tesla = new Company(1000000, 150000, 100000, 45000, "Tesla");
        //hire staff
        for (int i = 0; i < 180; i++) {
            tesla.hire(new Operator());
        }
        for (int i = 0; i < 80; i++) {
            tesla.hire(new Manager());
        }
        for (int i = 0; i < 10; i++) {
            tesla.hire(new TopManager());
        }

        //staff count
        System.out.println(tesla.getStaffCount());

        //top&low
        tesla.getTopSalaryStaff(10);
        tesla.getLowestSalaryStaff(30);

        //remove staff
        int staffCount = tesla.getStaffCount();
        int removeCount = staffCount / 2;
        for ( int i = 0; i < removeCount; i++){
            tesla.fire(i);
        }

        //staff count
        System.out.println(tesla.getStaffCount());

        //top&low
        tesla.getTopSalaryStaff(10);
        tesla.getLowestSalaryStaff(30);


    }

}


