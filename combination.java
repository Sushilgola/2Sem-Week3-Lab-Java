import java.util.*;
public class combination{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three Digit Number");
        int[] arr = new int[3];
        int num = 0;
        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<3; i++){
            num = num*10 + arr[i];
        }
        System.out.println(num);

    }
}