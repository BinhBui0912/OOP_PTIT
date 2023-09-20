import java.util.Scanner;
/**
 *
 * @author Duy Binh
 */
public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            long s = 0, sum = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += (long)a[i];
            }
            boolean ok = false;
            for(int i = 0; i < n; i++){
                s += (long)a[i];
                if(sum - s == s - a[i]){
                    ok = true;
                    System.out.println(i + 1);
                    break;
                }
            }            
            if(!ok) System.out.println("-1");
        }   
    }
}
