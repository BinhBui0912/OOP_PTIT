import java.util.Scanner;
/**
 *
 * @author duybi
 */

public class J01022 {
    static long[] F = new long[93];
    public static void solve(int n, long k){
        while(n > 2){
            if(k <= F[n - 2]){
                n -= 2;
            }
            else{
                k -= F[n - 2];
                n -= 1;
            }
        }
        if(n == 1) System.out.println("0");
        else System.out.println("1");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        F[1] = F[2] = 1;
        for(int i = 3; i <= 92; i++){
            F[i] = F[i - 2] + F[i - 1];
        }
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            solve(n, k);
        }
    }
}
