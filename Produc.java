import java.util.Scanner;

public class Produc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product #1 name: ");
        String Product1 = scanner.nextLine();
        System.out.println("Product #1 name = " + Product1);

        System.out.print("Enter price Product #1: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Product #2 name: ");
        String Product2 = scanner.nextLine();
        System.out.println("Product #2 name = " + Product2);

        System.out.print("Enter price Product #2: ");
        double price2 = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Product #3 name: ");
        String Product3 = scanner.nextLine();
        System.out.println("Product #3 name = " + Product3);

        System.out.print("Enter price Product #3: ");
        double price3 = scanner.nextDouble();

        System.out.print("Customer paid money: ");
        double Customerpaid = scanner.nextDouble();

        System.out.println()

        

       
    }
}
