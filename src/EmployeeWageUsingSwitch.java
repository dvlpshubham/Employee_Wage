public class EmployeeWageUsingSwitch {
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;
    public static final int empRatePerHour = 20;

    public static void  main(String[] args) {
        int empHours = 0;
        int empWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case is_part_time:
                empHours = 4;
                break;
            case is_full_time:
                empHours = 8;
                break;
            default:
                empHours = 0;

        }
        empWage = empHours * empRatePerHour ;
        System.out.println("Employee wage : " + empWage);
    }

}
