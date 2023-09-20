import java.math.BigInteger;
import java.util.*;
public class J03011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            System.out.println(a.gcd(b));
        }
    }
}
