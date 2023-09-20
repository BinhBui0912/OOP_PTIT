
import java.math.BigInteger;
import java.util.Scanner;
public class J03015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        BigInteger a = new BigInteger(A);
        BigInteger b = new BigInteger(B);
        System.out.println(a.subtract(b)); 
    }
}
