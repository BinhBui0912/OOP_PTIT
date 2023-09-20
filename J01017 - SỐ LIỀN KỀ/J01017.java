
import java.util.Scanner;



/**
 *
 * @author duybi
 */
public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            int check = 1;
            while(n > 10){
                long x = n % 10;
                long y = (n / 10) % 10;
                if(Math.abs(x - y) != 1){
                    check = 0;
                    break;
                }
                n /= 10;
            }
            if(check == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
