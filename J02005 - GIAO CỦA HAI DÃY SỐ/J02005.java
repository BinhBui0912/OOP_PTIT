
import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] cnt = new int[1001];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            cnt[a[i]] = 1;
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            if(cnt[b[i]] == 1) cnt[b[i]] = 2;
        }
        for(int i = 1; i < 1000; i++){
            if(cnt[i] == 2)
                System.out.print(i + " ");
        }
    }
}
