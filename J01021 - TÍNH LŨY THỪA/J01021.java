import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J01021 {
    public static long powMod(long a, long b, long mod){
        if(b == 0) return 1;
        if(b % 2 == 0) 
            return powMod(a * a % mod, b / 2, mod) % mod;
        else
            return a * powMod(a * a % mod, b / 2, mod) % mod;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long mod = (long)1e9 + 7;
            if(x == 0 && y == 0) break;
            System.out.println(powMod(x, y, mod));
        }
    }
}