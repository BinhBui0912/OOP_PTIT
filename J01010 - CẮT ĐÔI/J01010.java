
import java.util.Scanner;


/**
 *
 * @author duybi
 */
public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long cnt = 0, check = 0;
            int st = 0;
            if(n == 0) System.out.println("");
            while(n > 0){               
                int x = (int) (n % 10);
                if((x == 0) || (x == 8) || (x == 9)){
                    cnt = (long) (0 * Math.pow(10, st++)) + cnt;
                    
                }
                else if(x == 1){
                    cnt = (long) (1 * Math.pow(10, st++)) + cnt;
                }
                else{
                    check = 1;
                }             
                n /= 10;
            }
            if(check == 1 || cnt == 0){
                System.out.println("INVALID");
            }
            else{
                System.out.println(cnt);
            }       
        }
    }
}
