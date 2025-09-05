import java.util.Scanner;
 public class Bmi{
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Hihg1: ");
                double A = scanner.nextDouble();

            System.out.print("Enter Hihg2: ");
                double b = scanner.nextDouble();

            System.out.print("Enter Weight: ");
                double c = scanner.nextDouble();

                double Bmi = c /( A * b );

            System.out.println("Bmi = "+Bmi);
        }
    }