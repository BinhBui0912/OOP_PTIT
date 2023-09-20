
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>[] arr = new ArrayList[1001];     
        for(int i = 1; i <= 1000; i++){
            arr[i] = new ArrayList<Integer>();
        }
        int n = sc.nextInt();
        int[][] a = new int[n + 1][n + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(a[i][j] == 1){
                    arr[i].add(j);
                    arr[j].add(i);
                }
            }           
        }
        for(int i = 1; i <= n; i++){
            System.out.print("List(" + i + ") = ");
            for(int x : arr[i]){
                System.out.print(x + " ");    
            }
            System.out.println();
        }   
    }
}

