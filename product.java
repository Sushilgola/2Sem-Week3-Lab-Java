import java.util.*;
public class product{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int sum_num = 0;
        float num_product = 1;
        System.out.println("Enter 4 Numbers");
        int[] arr = new int[4];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            sum_num += arr[i];
            num_product *= arr[i];
        }
        System.out.println("Sum: "+sum_num+"\nProduct: "+num_product);
    }
}