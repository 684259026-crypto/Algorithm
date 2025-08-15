import java.util.Scanner;

public class DressCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับข้อมูลจากผู้ใช้
        System.out.print("Enter price of one dress: ");
        double pricePerDress = sc.nextDouble();

        System.out.print("Enter number of dresses to buy: ");
        int numberOfDresses = sc.nextInt();

        System.out.print("Enter discount rate: ");
        double discountRate = sc.nextDouble();

        // คำนวณ
        double totalCost = pricePerDress * numberOfDresses;
        double discountAmount = (discountRate / 100) * totalCost;
        double netPay = totalCost - discountAmount;

        // แสดงผลลัพธ์
        System.out.println("--------------------------------------------------");
        System.out.println("Total cost = " + totalCost + " Baht");
        System.out.println("discountAmount = " + discountAmount + " Baht");
        System.out.println("Net Pay = " + netPay + " Baht");

        sc.close();
    }
}