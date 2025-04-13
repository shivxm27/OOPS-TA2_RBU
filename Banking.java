
import java.util.Scanner;




public class Acc {
   String name;
   String pin;
   String AccNum;
   double balance;


   public Acc(String name, String AccNum, String pin, double balance){
       this.name= name;
       this.AccNum = AccNum;
       this.pin = pin;
       this.balance = balance;


   }


   public void Deposit(double amount){
       if(amount > 0 ){
           balance = balance + amount;
           System.out.println("Amount Deposited." +amount);
       }
       else{
           System.out.println("Invalid Deposit");
       }
   }


   public void Withdraw(double amount){
       if(amount > 0 && amount < balance){
           balance = balance - amount;
           System.out.println("Amount Withdrawn: "+amount);
       }
       else{
           System.out.println("Insufficent or Invalid amount");
       }
   }
   public void disBal(){
       System.out.println("The Current Balance is : "+balance);
   }




   public static void main(String []args){
       Scanner scanner = new Scanner(System.in);








       System.out.print("Enter Your Name: ");
       scanner.nextLine();  // Consume leftover newline
       String name = scanner.nextLine();


       System.out.print("Enter your Account Number: ");
       String AccNum = scanner.next();


       System.out.print("Enter your PIN (4-digit Numeric): ");
       String pin = scanner.next();


       System.out.print("Enter your Initial Account Balance: ");
       double balance = scanner.nextDouble();


       Acc myAcc = new Acc(name, AccNum, pin, balance);




       myAcc.Deposit(500);
       myAcc.disBal();


       myAcc.Withdraw(200);
       myAcc.disBal();


  
       myAcc.disBal();














       scanner.close();
   }
}
