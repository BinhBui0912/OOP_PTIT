
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int cnt1 = 0, cnt0 = 0;
            for(int j = 0; j < 3; j++){
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1) cnt1++;
                if(a[i][j] == 0) cnt0++;
            }
            if(cnt1 > cnt0) cnt++;
        }
        System.out.println(cnt);
    }
}

