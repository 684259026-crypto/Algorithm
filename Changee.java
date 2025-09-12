import java.util.Scanner;

public class  Changee{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter produc price ");
        int produc = input.nextInt();
        
        System.out.print("Enter banknote ");
        int banknote = input.nextInt();

        System.out.println("amout to pay = " +produc);


        int change = banknote - produc ;
        System.out.println("change is ="+change);

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
