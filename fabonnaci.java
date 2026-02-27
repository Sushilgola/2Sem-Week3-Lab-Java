import java.util.*;
public class fabonnaci{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Range of Fibonacci Series:");
        int n = sc.nextInt();
        int a = 0;
        int b= 1;
        for(int i=0; i<n; i++){
            int c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;
        }
    }
}