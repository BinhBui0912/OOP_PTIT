
import java.util.Scanner;


/*
 *
 * @author duybi
 */
public class J01006 {
    public static long fiBo(int n){
        long f1 = 1;
        long f2 = 1;
        if((n == 1) || (n == 2)) return 1;
        long fn = 0; 
        for(int i = 3; i <= n; i++){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(fiBo(n));
        }
    }
}
