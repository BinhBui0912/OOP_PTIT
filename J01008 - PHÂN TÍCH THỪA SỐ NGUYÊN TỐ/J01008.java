
import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 1;
        while(t-- > 0){        
            int n = sc.nextInt();
            System.out.print("Test " + x++ + ": ");
            for(int i = 2; i <= Math.sqrt(n); i++){
                int dem = 0;
                if(n % i == 0){
                    while(n % i == 0){
                        dem++;
                        n /= i;
                    }
                    System.out.print(i + "(" + dem + ") ");
                }               
            }
            if(n > 1) System.out.print(n + "(" + 1 + ") ");
            System.out.println();
        }
    }
}
