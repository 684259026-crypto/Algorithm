import java.util.Scanner;

public class Midterm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your midterm score: ");
        int midterm = input.nextInt();

        System.out.print("Enter your final score: ");
        int finalExam = input.nextInt();

        int total = midterm + finalExam;
        System.out.println("Your total score is " + total + " .");

        if (total >= 50) {
            System.out.println("The result is Pass!!");
        } else {
            System.out.println("The result is Fail!!");
        }
    }
}
