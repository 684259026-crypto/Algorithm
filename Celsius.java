import java.util.Scanner;
 public class Celsius{
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Fahranheit: ");
                double A = scanner.nextDouble();

            double Celsius = (5.0/9) * (A-32);
            System.out.println("Celsius = "+Celsius);
        }
    }