import java.util.Scanner;
class BankAccount{
    int acNo;
    String acName,acPhone,acEmail;
    double AcBal;
    public BankAccount(int acNo,String acName, String acPhone, String acEmail, double AcBal){
        this.acNo=acNo;
        this.AcBal=AcBal;
        this.acPhone=acPhone;
        this.acEmail=acEmail;
        this.acName=acName;
    }
    public void accountholder(){
        System.out.println("Account Number: "+acNo);
        System.out.println("Account Holder Name: "+acName);
        System.out.println("Account Holder Address: "+acPhone);
        System.out.println("Account Holder Phone: "+acEmail);
        System.out.println("Account Holder Balance: "+AcBal);

    }
    public void deposit(double amount){
        AcBal+=amount;
        System.out.println("Deposited: "+amount);
    }
    public void displaybalance(){
        System.out.println("Account Number: "+acNo+"\tBalance: $"+AcBal);

    }


}
class savingsAccount extends BankAccount{
    public savingsAccount(int acNo,String acName, String acPhone, String acEmail, double AcBal){
        super(acNo,acName,acPhone,acEmail,AcBal);
    }
}
class currentAccount extends BankAccount{
    public currentAccount(int acNo,String acName, String acPhone, String acEmail, double AcBal){
        super(acNo,acName,acPhone,acEmail,AcBal);
    }
}

public class Main {
    public static void main(String[] args) {
     savingsAccount asc=new savingsAccount(1001,"james kariuki","0705795711","james@gmail.com",500);
     System.out.println("SAVINGS ACCOUNT DETAILS");
     asc.accountholder();
     asc.displaybalance();
     currentAccount cA=new currentAccount(1002,"Paul Njugunah","0718686993","paulNjuguna@gmail.com",300);
     System.out.println("\n");
     System.out.println("CURRENT ACCOUNT DETAILS");
     cA.accountholder();
     cA.displaybalance();
    }
}