import java.util.*;
public class digit_separator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int divisor = 1000;

        while (divisor>0){
            int digit = num/divisor;
            System.err.println(digit);
            num = num % divisor;
            divisor /= 10;
        }

    }
}