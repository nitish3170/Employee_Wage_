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
    static void CalculateDailyWage(){
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math. floor (Math.random () * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage) ;
    }
    static void PartTimeEmpWage(){
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;

        double empCheck = Math.floor (Math.random () * 10) % 3;
        if (empCheck == IS_PART_TIME)
            empHrs = 4;
        else if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println ("Emp Wage: " + empWage);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        CheckAttendance();
        CalculateDailyWage();
        PartTimeEmpWage();


    }
}