import java.util.*;
public class testAll {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        char again = 'y';

        while(again=='y'){
             System.out.println("1 for First Program\n2 For Second Program\n3 For Third Program\n4 For Fourth Program\n5 For Fifth Program. ");
            System.out.println("Enter the Choice: ");
            int num_choice = sc.nextInt();
            switch (num_choice) {
                case 1:
                    System.out.println("Welcome To Fabonaci Sequence Program");
                    fabonnaci p1 = new fabonnaci();
                    p1.testprogram();
                    break;
                case 2:
                    System.out.println("Welcome To Combination of Digits Program");
                    combination p2 = new combination();
                    p2.testprogram();
                    break;
                case 3:
                    System.out.println("Welcome To Sum and Product of Number Program");
                    product p3 = new product();
                    p3.testprogram();
                    break;
                case 4:
                    System.out.println("Welcome To Digit Separator Program");
                    digit_separator p4 = new digit_separator();
                    p4.testprogram();
                    break;
                case 5:
                    System.out.println("Welcome To Rectangle Intersection Program");
                    rectangle p5 = new rectangle();
                    p5.testprogram();
                    break;
                default:
                    System.out.println("You Type Wrong Number.");
            }
            System.out.println("\nYou Want To Run Again then Press(y/n)");
            again = sc.next().charAt(0);
        }
        System.out.println("Exit From Program.");
    }
}
