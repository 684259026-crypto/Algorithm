import java.util.Scanner;
 public class TwoWay{
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter number");
                int number1 = scanner.nextInt();

                if (number1 %2 == 0) {
                    System.out.println("เลขคู่");
                } else {
                    System.out.println("เลขคี่");
                }
                System.out.println("จบโปรเเกรม");
        }
    }