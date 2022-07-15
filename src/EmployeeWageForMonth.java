public class EmployeeWageForMonth {
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;
    public static final int empRatePerHour = 20;
    public static final int numOfWorkingDays = 2;

    public static void  main(String[] args) {
        int empHours = 0;
        int empWage = 0;
        int totalEmployeeWage = 0;
        for (int day = 0; day < numOfWorkingDays; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10 ) % 3 ;
            switch (empCheck) {
                case is_part_time:
                    empHours = 4;
                    break;
                case is_full_time:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
                    empWage = empHours * empRatePerHour ;
                    totalEmployeeWage += empWage;
                    System.out.println("Employee wage : " + empWage);

            }
            System.out.println("Total Employee Wage : " + totalEmployeeWage);
        }
    }
}
