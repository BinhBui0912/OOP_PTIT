
import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J01018 {
    public static long tongChuSo(long n){
        long sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    public static boolean check(long n){
        while(n > 10){
            long x = n % 10;
            long y = (n / 10) % 10;
            if(Math.abs(x - y) != 2) return false;
            n /= 10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if((tongChuSo(n) % 10 == 0) && (check(n) == true)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
