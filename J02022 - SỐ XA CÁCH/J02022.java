import java.util.Scanner;
/**
 *
 * @author Duy Binh
 */
public class J02022 {
    static int[] X = new int[100];
    static int[] daxet = new int[100];
    
    public static boolean check(int[] arr, int n){
        for(int i = 1; i < n; i++){
            if(Math.abs(arr[i] - arr[i + 1]) == 1)
                return false;
        }
        return true;
    }
    
    public static void Try(int n, int i){
        for(int j = 1; j <= n; j++){
            if(daxet[j] == 0){
                X[i] = j;
                daxet[j] = 1;
                if(i == n && check(X, n)){
                    for(int k = 1; k <= n; k++){
                        System.out.print(X[k]);
                    }
                    System.out.println();
                }
                else Try(n, i + 1);
                daxet[j] = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Try(n, 1);
            
        }
    }
}
