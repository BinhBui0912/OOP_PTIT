
import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        while(t-- > 0){
            double n = sc.nextDouble();
            double h = sc.nextDouble();
            for(int i = 1; i < n; i++){
                System.out.printf("%.6f ", h * Math.sqrt(i / n));
            }
            System.out.println();
        }
    }
}
