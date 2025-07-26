import java.util.Scanner;
public class Pencil {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int A = scanner.nextInt();

        System.out.print("Enter num 2: ");
        int R = scanner.nextInt();

        int sum = A * R;

        System.out.println("Sum = " + sum +" of " + A + " & " + R );
    }
}