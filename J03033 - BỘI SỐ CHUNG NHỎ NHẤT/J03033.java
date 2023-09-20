import java.math.BigInteger;
import java.util.Scanner;

public class J03033{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String A = sc.next();
            String B = sc.next();
            BigInteger a = new BigInteger(A);
            BigInteger b = new BigInteger(B);
            BigInteger c = a.multiply(b);
            BigInteger d = a.gcd(b);
            System.out.println(c.divide(d));
        }
    }
}
