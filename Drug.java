import java.util.Scanner;

public class Drug{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age ");
        int age = sc.nextInt();

        if (age < 0)
            System.out.println("wrong age");

        else if (age <= 1 ) {
            System.out.println("Do not take medicine");
        }   

        else if (age <= 3) 
            System.out.println("take 1/2 teaspoons.");

        else if (age <= 10) 
            System.out.println("take 1 teaspoons.");
            
        
        else {
             System.out.println("take 2 teaspoons.");
        }
    }
}



