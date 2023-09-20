
import java.util.Scanner;

/**
 *
 * @author duybi
 */
public class J01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            System.out.println(1L * (x + 1) * x / 2);           
        }
    }
}
