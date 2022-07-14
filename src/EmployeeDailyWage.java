public class EmployeeDailyWage {
    public static void main(String[] args) {
        int is_full_time = 1;
        int emp_rate_per_hour = 20;

        int empHours = 0;
        int empWage = 0;

        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == is_full_time)
            empHours = 8;
        else

            empHours = 0;
        empWage = empHours * emp_rate_per_hour;
        System.out.println("Emp Wage : " + empWage);
    }
}

