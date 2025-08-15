import java.util.Scanner;
 public class Area{
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter wide: ");
                int A = scanner.nextInt();

            System.out.print("Enter long: ");
                int b = scanner.nextInt();

                int Area = (A * b)/360;

            System.out.println("Area = "+Area);
        }
    }