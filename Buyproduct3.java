
import java.util.Scanner;

public class Buyproduct3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product 1 name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter product 1 price: ");
        double price1 = scanner.nextDouble();
        System.out.print("Enter quantity for product 1: ");
        int qty1 = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter product 2 name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter product 2 price: ");
        double price2 = scanner.nextDouble();
        System.out.print("Enter quantity for product 2: ");
        int qty2 = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter product 3 name: ");
        String name3 = scanner.nextLine();
        System.out.print("Enter product 3 price: ");
        double price3 = scanner.nextDouble();
        System.out.print("Enter quantity for product 3: ");
        int qty3 = scanner.nextInt();

        System.out.print("Enter amount paid: ");
        double paid = scanner.nextDouble();

        double total1 = price1 * qty1;
        double total2 = price2 * qty2;
        double total3 = price3 * qty3;
        double subtotal = total1 + total2 + total3;
        double vat = subtotal * 0.07; 
        double totalIncludingVAT = subtotal + vat;
        double change = paid - totalIncludingVAT;

        System.out.println("\n----- Receipt -----");
        System.out.println(name1 + ": " + String.format("%.2f", price1) + " x " + qty1 + " = " + String.format("%.2f", total1) + " Baht");
        System.out.println(name2 + ": " + String.format("%.2f", price2) + " x " + qty2 + " = " + String.format("%.2f", total2) + " Baht");
        System.out.println(name3 + ": " + String.format("%.2f", price3) + " x " + qty3 + " = " + String.format("%.2f", total3) + " Baht");
        System.out.println("Subtotal: " + String.format("%.2f", subtotal) + " Baht");
        System.out.println("VAT 7%: " + String.format("%.2f", vat) + " Baht");
        System.out.println("Total including VAT: " + String.format("%.2f", totalIncludingVAT) + " Baht");
        System.out.println("Amount paid: " + String.format("%.2f", paid) + " Baht");
        System.out.println("Change: " + String.format("%.2f", change) + " Baht");

        scanner.close();
    }
}
