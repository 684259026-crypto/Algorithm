import java.util.Scanner;
 public class Bmi{
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Hihg1: ");
                int A = scanner.nextInt();

            System.out.print("Enter Hihg2: ");
                int b = scanner.nextInt();

            System.out.print("Enter Weight: ");
                int c = scanner.nextInt();

                int Bmi = c /( A * b );

            System.out.println("Bmi = "+Bmi);
        }
    }