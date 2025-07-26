import java.util.Scanner;
    public class Square {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("base");
            double num1 = scanner.nextInt();

         System.out.print("high");
            double num2 = scanner.nextInt();

            double base = num1*num2;

            double triangle = (base*1/2);

        System.out.print("side1");
            double num3 = scanner.nextInt();

          System.out.print("side2");
            double num4 = scanner.nextInt();

            double square = num2*num4;

            System.out.println("triangle ="+triangle);
            System.out.println("square ="+square);


    }
 }