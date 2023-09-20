import java.util.Scanner;
/**
 *
 * @author duybi
 */
public class J02004 {
    public static String solve (int n, int[] a){
        int l = 0, r = n - 1;
        while(l <= r){
            if(a[l++] != a[r--]){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[101];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            System.out.println(solve(n, a));
        }
    }
}
