import java.util.Scanner;
/**
 *
 * @author duybi
 */
public class J02011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < n - 1; i++){
            int min_idx = i;
            for(int j = i + 1; j < n; j++){
                if(a[j] < a[min_idx]){
                    min_idx = j;
                }
            }
            if(min_idx != i){
                int tmp = a[i];
                a[i] = a[min_idx];
                a[min_idx] = tmp;
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int k = 0; k < n; k++){
                System.out.print(a[k] + " ");               
            }
            System.out.println();
        }        
    }
}
