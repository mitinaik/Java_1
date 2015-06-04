import java.util.Scanner;
public class practiceing 
{
   public static void main(String[] args)
   {
      Scanner input =  new Scanner(System.in);
      
           
      double overtimeHrs, regularPay,overtimePay, hourlyrate, paybftax, stateamt, fedamt, netpay;
      int regularHrs = 40;
      final double statetax = 0.07, fedtax = 0.03, overtimeRate = 1.5;
      
      //display short message
      System.out.println(" This is my payroll program");
      
      // ask users for inputs
      
      System.out.println("Enter the number of overtime hours: ");
      overtimeHrs = input.nextDouble();
      
            
      System.out.println(" Enter the hourlyrate: ");
      hourlyrate = input.nextDouble();
      
      
      
      regularPay = regularHrs * hourlyrate;
      overtimePay = overtimeHrs * overtimeRate;
      paybftax = regularPay + overtimePay;
      stateamt = paybftax * statetax;
      fedamt = paybftax * fedtax;
      netpay = paybftax - stateamt - fedamt;
      
      // ask users for outputs
      
      System.out.println(" The regular pay before tax is " + paybftax);
      System.out.println(" The state amount is " + stateamt);
      System.out.println(" The fedral amount is " +fedamt);
      System.out.println(" The net pay is " + netpay);
      
      // Payroll program
      
      
      
      
   }
}