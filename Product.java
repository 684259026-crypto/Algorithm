import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter price of one dress: ");
        double priceOfOneDress = scanner.nextDouble();

        System.out.print("Enter number of dresses to buy: ");
        int numberOfDresses = scanner.nextInt();

        System.out.print("Enter discount rate: ");
        double discountRate = scanner.nextDouble();

        double totalCost = priceOfOneDress * numberOfDresses;

        double discountAmount = totalCost * (discountRate / 100.0);

        double netPay = totalCost - discountAmount;

        System.out.printf("Total cost = %.1f Baht%n", totalCost);
        System.out.printf("discountAmount = %.1f Baht%n", discountAmount);
        System.out.printf("Net Pay = %.1f Baht%n", netPay);

    }
}