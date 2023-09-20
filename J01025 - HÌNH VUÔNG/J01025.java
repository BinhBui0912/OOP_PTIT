
import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        int a = Math.max(x1, Math.max(x2, Math.max(x3, x4))) - Math.min(x1, Math.min(x2, Math.min(x3, x4)));
        int b = Math.max(y1, Math.max(y2, Math.max(y3, y4))) - Math.min(y1, Math.min(y2, Math.min(y3, y4)));
        System.out.println(Math.max(a, b) * Math.max(a, b));
    }     
}

