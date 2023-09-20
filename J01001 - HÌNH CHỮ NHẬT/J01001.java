
import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a > 0) && (b > 0)){
            System.out.print(a * 2 + b * 2 + " ");
            System.out.println(a * b);
        }
        else{
            System.out.println("0");
        }
    }
}
