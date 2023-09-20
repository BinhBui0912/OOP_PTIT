
import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J01026 {
    public static boolean soChinhPhuong(int n){
        int x = (int) Math.sqrt(n);
        if(x * x == n) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(soChinhPhuong(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
