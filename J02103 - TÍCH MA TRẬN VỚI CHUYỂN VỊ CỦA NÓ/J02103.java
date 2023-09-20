
import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 1;
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            int[][] b = new int[m][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    b[j][i] = a[i][j];
                }
            }
            int[][] c = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    c[i][j] = 0;
                    for(int k = 0; k < m; k++){
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Test " + x + ":");
            x++;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }       
    }
}
