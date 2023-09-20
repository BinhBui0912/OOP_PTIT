
import java.util.Scanner;

/**
 *
 * @author duybi
 */
public class J01016 {
    public static void main(String[] args) {              
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count4 = 0, count7 = 0;
        while(n > 0){
            if(n % 10 == 4) count4++;
            else if(n % 10 == 7) count7++;
            n /= 10;
        }
        if((count4 + count7) == 4 || (count4 + count7) == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
