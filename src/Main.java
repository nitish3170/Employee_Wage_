import java.util.Scanner;

public class Main {
    static void CheckAttendance(){
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random () * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
    }
}