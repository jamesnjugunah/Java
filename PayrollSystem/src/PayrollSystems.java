import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PayrollSystems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP: ");
        int employeeNo = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("EMPLOYEE NAME: ");
        String employeeName = scanner.nextLine();
        System.out.print("DESIGNATION: ");
        String designation = scanner.nextLine();
        System.out.print("DAYS WORKED: ");
        int daysWorked = scanner.nextInt();
        System.out.print("PAY RATE: ");
        double payRate = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        // Get the current date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();

        // Constants
        final double PROF_TAX_RATE = 0.20;

        // Calculate earnings and deductions
        double basicPay = daysWorked * payRate;
        double pf = basicPay / 10;
        double profTax = basicPay * PROF_TAX_RATE;
        double grossEarnings = basicPay;
        double totalDeductions = pf + profTax;
        double netPay = grossEarnings - totalDeductions;

        // Display the payslip
        System.out.println("\nSHREE KRISHNA CHEMISTS AND DRUGGIST");
        System.out.println("SALARY MONTH: " + dateFormat.format(currentDate));
        System.out.println("EMP.NO.: " + employeeNo);
        System.out.println("EMP. NAME: " + employeeName);
        System.out.println("DESIGNATION: " + designation);
        System.out.println("DAYS WORKED: " + daysWorked);
        System.out.println("PAY RATE: " + payRate);
        System.out.println("GEN.DATE: " + dateFormat.format(currentDate));
        System.out.println("EARNINGS");
        System.out.println("BASIC PAY");
        System.out.println(basicPay);
        System.out.println("DEDUCTIONS");
        System.out.println("P.F.");
        System.out.println(pf);
        System.out.println("PROF.TAX");
        System.out.println(profTax);
        System.out.println("GROSS EARN.");
        System.out.println(grossEarnings);
        System.out.println("TOTAL DEDUCT.");
        System.out.println(totalDeductions);
        System.out.println("NET PAY");
        System.out.println(netPay);

        scanner.close();
    }
}
