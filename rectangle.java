import java.awt.Rectangle;
import java.util.*;
public class rectangle{
    public static void testprogram() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first rectangle Cordinate: (x1, y1, w1, h1) ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int w1 = sc.nextInt();
        int h1 = sc.nextInt();

        System.out.println("Enter the Second Ractangle cordinate: (x2, y2, w2, h2) ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int w2 = sc.nextInt();
        int h2 = sc.nextInt();

        Rectangle r1 = new Rectangle(x1,y1,w1,h1);
        Rectangle r2 = new Rectangle(x2,y2,w2,h2);
        Rectangle result = (r2.intersection(r1));

        if (result.height < 0 && result.width < 0){
            System.out.println("No Intersection.");
        }
        else{
            System.out.println(result);
        }
        
    }
}