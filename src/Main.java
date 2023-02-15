import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String answer2 = " ";

        System.out.println("Enter cost");
        Scanner scan = new Scanner(System.in);
        int cost = scan.nextInt();

        {
            System.out.println("Choose country (c) or state tax (s)");
            Scanner scan2 = new Scanner(System.in);
            answer2 = scan2.nextLine();

            if (answer2.toLowerCase().startsWith("c")) {
                double statetax = cost * 1.05;
                System.out.println(statetax);
            }
            else {
                double countrytax = cost * 1.1;
                System.out.println(countrytax);
            }
        }
    }
}