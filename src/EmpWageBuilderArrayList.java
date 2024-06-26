import java.util.ArrayList;
import java.util.Scanner;

interface EmpWage{
    public int computeEmpWage(CompanyEmpWage companyEmpWage);
}
public class EmpWageBuilderArrayList implements EmpWage{
    static Scanner sc=new Scanner(System.in);
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private int numOfCompany = 0;
    private ArrayList<CompanyEmpWage> companyEmpWageArray;
    public EmpWageBuilderArrayList() {
         companyEmpWageArray = new ArrayList<>();
    }
    private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage =new CompanyEmpWage(company, empRatePerHour,numOfWorkingDays, maxHoursPerMonth);
        companyEmpWageArray.add(companyEmpWage);
}
    public void computeEmpWage() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageArray) {
            int totalWage = this.computeEmpWage(companyEmpWage);
            companyEmpWage.setTotalEmpWage(totalWage);
            System.out.println(companyEmpWage);
        }
    }
        public int computeEmpWage(CompanyEmpWage companyEmpWage) {
// Variables
            int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
// Computation
            while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case IS_PART_TIME:
                        empHrs = 4;
                        break;
                    case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                    default:
                        empHrs = 0;
                }

                totalEmpHrs += empHrs;
                int dailyWage=empHrs*companyEmpWage.empRatePerHour;
                companyEmpWage.dailyWages.add(dailyWage);
                System.out.println("Day#: " + totalWorkingDays +" Emp hr: " + empHrs + " Emp wage: " + companyEmpWage.dailyWages.get(totalWorkingDays-1));

            }
            return totalEmpHrs * companyEmpWage.empRatePerHour;
        }
        public void companyWage(){
            System.out.println("Enter the company name");
            String cName=sc.next();
            int sal=0;
            for (CompanyEmpWage companyEmpWage : companyEmpWageArray) {
                if (companyEmpWage.company.equals(cName)){
                    sal+=companyEmpWage.totalEmpWage;
                }
            }
            System.out.printf("Total company wage of %s : %d",cName,sal);
        }
        public static void main(String[] args) {
            EmpWageBuilderArrayList empWageBuilder=new EmpWageBuilderArrayList();
            empWageBuilder.addCompanyEmpWage("DMart", 20, 4, 10);
            empWageBuilder.addCompanyEmpWage("DMart", 20, 4, 10);
            empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
            empWageBuilder.computeEmpWage();
            empWageBuilder.companyWage();
    }
}