import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("temperature in celsius ");
        int temperature = sc.nextInt();

        System.out.println("temperature "+ temperature +" Celsius");

        if (temperature >= 35)
            System.out.println("Hot");

        else if (temperature >= 20) {
            System.out.println("Nomal");
        } 

        else {
            System.out.println("Clod");
        }
    }
}