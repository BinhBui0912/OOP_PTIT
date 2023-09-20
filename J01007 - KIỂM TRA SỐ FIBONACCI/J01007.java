
import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J01007 {
    public static boolean checkFiBo(long n){
        if((n == 0) || (n == 1)) return true;
        long f0 = 0,  f1 = 1;
        for(int i = 2; i <= 92; i++){
            long fn = f0 + f1;
            if(fn == n){
                return true;
            }
            f0 = f1;
            f1 = fn;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(checkFiBo(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
