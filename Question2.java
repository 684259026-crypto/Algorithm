import java.util.Scanner;

public class  Question2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter your money");
        int money = input.nextInt();

        System.out.print("Enter price product");
        int price = input.nextInt();
        
        System.out.print("Enter quantity");
        int quantity = input.nextInt();



        if ( money < price ) {
            System.out.print("Not enogh money");
        } else { 
            int sum = quantity - price ;
            System.out.println("Amount to be paid = " + sum + " baht");
        }

        int fivehundred = change / 500 ;
         change = change % 500;
        System.out.println("Five-hundred note = " +fivehundred + " note(s)");

        int hundred = change / 100 ;
         change = change % 100;
        System.out.println("hundred note = " +hundred + " note(s)");

         int fifty = change / 50 ;
         change = change % 50;
        System.out.println("fifty note = " +fifty + " note(s)");

        int twenty = change / 20 ;
         change = change % 20;
        System.out.println("twenty note = " +twenty + " note(s)");

        int ten = change / 10 ;
         change = change % 10;
        System.out.println("ten note = " +ten + " note(s)");

        int five = change / 5 ;
         change = change % 5;
        System.out.println("five note = " +five + " note(s)");

        int two = change / 2 ;
         change = change % 2;
        System.out.println("two note = " +two + " note(s)");

        int one = change / 50 ;
         change = change % 50;
        System.out.println("one note = " +one + " note(s)");

     }  
 }

