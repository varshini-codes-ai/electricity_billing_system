import java.util.Scanner;

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== ELECTRICITY BILLING SYSTEM =====");

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Customer ID: ");
        int customerId = sc.nextInt();

        System.out.print("Enter Units Consumed: ");
        double units = sc.nextDouble();

        double bill;

        if (units <= 100) {
            bill = units * 1.5;
        } 
        else if (units <= 200) {
            bill = (100 * 1.5) + ((units - 100) * 2.5);
        } 
        else if (units <= 300) {
            bill = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 4.0);
        } 
        else {
            bill = (100 * 1.5) + (100 * 2.5) + (100 * 4.0) + ((units - 300) * 5.0);
        }

        System.out.println("\n===== ELECTRICITY BILL =====");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Units Used    : " + units);
        System.out.println("Total Bill    : ₹" + bill);

        sc.close();
    }
}
