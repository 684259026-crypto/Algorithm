import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product #1 name: ");
        String product1 = scanner.nextLine();
        System.out.print("Enter price Product #1: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Product #2 name: ");
        String product2 = scanner.nextLine();
        System.out.print("Enter price Product #2: ");
        double price2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Product #3 name: ");
        String product3 = scanner.nextLine();
        System.out.print("Enter price Product #3: ");
        double price3 = scanner.nextDouble();

        System.out.print("Customer paid money: ");
        double customerPaid = scanner.nextDouble();

        double totalPrice = price1 + price2 + price3;
        double vat = totalPrice / 0.07;
        double netPrice = totalPrice + vat;
        double change = customerPaid - netPrice;

        System.out.println("\n----- Receipt -----");
        System.out.println(product1 + ": " + price1 + " baht");
        System.out.println(product2 + ": " + price2 + " baht");
        System.out.println(product3 + ": " + price3 + " baht");
        System.out.println("Total = " + totalPrice + " baht");
        System.out.println("VAT = " + String.format("%.2f", vat) + " baht");
        System.out.println("Net price " + String.format("%.2f", netPrice) + " baht");
        System.out.println("Total paid " + customerPaid + " baht");
        System.out.println("Change = " + String.format("%.2f", change) + " baht");

        scanner.close();
    }
}
