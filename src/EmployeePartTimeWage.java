public class EmployeePartTimeWage {
    public static void main(String[] args) {
        int is_part_time = 1;
        int is_full_time = 2;
        int empRatePerHour = 20;
        int empHours = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10 ) % 3 ;
        if (empCheck == is_part_time) {
            empHours = 4;
        }
        else if (empCheck == is_full_time) {
            empHours = 8;
        }
        else
            empHours = 0;
        empWage = empHours * empRatePerHour;
        System.out.println("Employee wage :" + empWage);
    }
}
