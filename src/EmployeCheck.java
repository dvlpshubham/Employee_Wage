import java.util.Random;
public class EmployeCheck {
    public static void main(String[] args) {
        int is_full_time = 1;
        double empCheck = Math.floor(Math.random() * 10 % 2);
        if (empCheck == is_full_time) {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}