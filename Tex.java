import java.util.Scanner;

public class Tex {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Num1");
        int M = scanner.nextInt();

        System.out.println("Enter Num2");
        double P = (10.0/100.0);

        double sum = M*P;

        System.out.println("Sum = " +sum);
    }
    
}