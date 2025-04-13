import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();

        double billAmount;

        if (units <= 100) {
            billAmount = units * 1.5;
        } else if (units <= 200) {
            billAmount = 100 * 1.5 + (units - 100) * 2.5;
        } else if (units <= 300) {
            billAmount = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4.0;
        } else {
            billAmount = 100 * 1.5 + 100 * 2.5 + 100 * 4.0 + (units - 300) * 5.0;
        }

        
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Customer Name: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: ₹" + billAmount);
    }
}
