import java.math.BigInteger;
import java.util.Scanner;

public class J03039{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String A = sc.next();
            String B = sc.next();
            BigInteger a = new BigInteger(A);
            BigInteger b = new BigInteger(B);
            BigInteger c = a.max(b);
            BigInteger d = a.min(b);
            if(c.mod(d).equals(BigInteger.ZERO))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
