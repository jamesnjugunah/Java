import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class MyWork {
    public static void main(String[] args) {
        Scanner myNo= new Scanner(System.in);
        Scanner myName = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = myName.nextLine();
        Scanner designate = new Scanner(System.in);
        System.out.print("Enter the designation: ");
        String designation = designate.next();
        Scanner work = new Scanner(System.in);
        System.out.print("enter the number of days worked: ");
        int workDays = work.nextInt();
        Scanner pay = new Scanner(System.in);
        System.out.print("Enter the pay rate:");
        int payRate = pay.nextInt();
        Scanner date = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String myDate = date.next();
        int basicSal = payRate*workDays;
        int pf = basicSal/10;
        final int profTax = 200;
        int grossEarn = basicSal;
        int totalDeduct = pf + profTax;
        int netPay = basicSal-totalDeduct;
        System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP: ");
        int num= myNo.nextInt();
        System.out.println("\t\t\t\t\t\tSHREE KRISHNA CHEMISTS AND DRUGGIST");
        System.out.println("\t\t\t\t\t\t\t\tSALARY MONTH 9 2013");
        System.out.println("\t\tEMP.NO.: "+num+"       EMP.NAME: "+name+"     DESIGNATION:"+designation);
        System.out.println("\t\tDAYS WORKED: "+workDays+"   PAY RATE: "+payRate+"  GEN.DATE:"+myDate);
        System.out.println("\t\t-----------------------------------------------------------------------------");
        System.out.println("\t\tEARNINGS          AMOUNT(R.S)           DEDUCTIONS            AMOUNT(RS");
        System.out.println("\t\t-----------------------------------------------------------------------------");
        System.out.println("\t\tBASIC PAY         "+basicSal+"          P.F.                   "+pf);
        System.out.println("                                            PROF.TAX               "+profTax);
        System.out.println("\t\t------------------------------------------------------------------------------");
        System.out.println("\t\tGROSS EARN.        "+grossEarn+"         TOTAL DEDUCT.          "+totalDeduct);
        System.out.println("                                             NET PAY                "+netPay);

    }
}
