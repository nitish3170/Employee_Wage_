import java.util.Scanner;

public class Main {
    public static boolean EmployeeAttendance(){
        double attendance=Math.random();
        if(attendance>0.5) return true;
        return false;
    }
    public static void DailyWage(){
        int dailyWage=20*8;
        System.out.printf("Daily wage of Employee: %d",dailyWage);
    }
    public static void PartTimeWage(){
        int partTimeWage=20*8;
        System.out.println("PArt time employee wage: %d");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        if (EmployeeAttendance()){
            System.out.println("Employee is present.");
        }
        else{
            System.out.println("Employee is absent");
        }

        DailyWage();
        PartTimeWage();

    }
}