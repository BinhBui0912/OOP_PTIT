
import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J01009 {
    public static long giaiThua(int n){
        long cnt = 1;
        for(int i = 2; i <= n; i++){
            cnt *= i;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 1;
        for(int i = 2; i <= n; i++){
            res += giaiThua(i);
        }
        System.out.println(res);
    }
}
