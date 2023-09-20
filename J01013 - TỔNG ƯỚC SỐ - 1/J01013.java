
import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Prime = new int[2000001];
        for(int i = 1; i <= 2000000; i++){
            Prime[i] = i;
        }
        for(int i = 2; i <= Math.sqrt(2000000); i++){
            if(Prime[i] == i){
                for(int j = i * i; j <= 2000000; j += i){
                    if(Prime[j] == j){
                        Prime[j] = i;
                    }
                }
            }
        }
        long sum = 0;
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            while(n > 1){
                sum += Prime[n];
                n /= Prime[n];
            }
        }
        System.out.println(sum);
    }
}
