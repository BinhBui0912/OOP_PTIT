
import java.util.Scanner;



/**
 *
 * @author duybi
 */
public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int ok = 1;
            while(n > 0){
                int x = n % 10;
                if(x != 0 && x != 1 && x != 2){
                    ok = 0;
                    break;
                }
                n /= 10;
            }
            if(ok == 1) 
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
