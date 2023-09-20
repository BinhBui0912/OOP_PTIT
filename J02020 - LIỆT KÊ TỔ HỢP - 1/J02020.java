import java.util.Scanner;
/**
 *
 * @author Duy Binh
 */
public class J02020 {
    static int[] X = new int [100];
    public static int cnt = 0;
    public static void Try(int n, int k , int i){
        for(int j = X[i - 1] + 1; j <= n - k + i; j++){
            X[i] = j;
            if(i == k){
                for(int l = 1; l <= k; l++){
                    System.out.print(X[l] + " ");
                }
                cnt++;
                System.out.println();
            }
            else Try(n, k, i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        X[0] = 0;
        Try(n, k, 1);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
