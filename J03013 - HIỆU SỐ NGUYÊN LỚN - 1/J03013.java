import java.math.BigInteger;
import java.util.*;
public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String s1 = sc.next();
            String s2 = sc.next();
            int n = Math.max(s1.length(), s2.length());           
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            BigInteger c = a.subtract(b).abs();
            String s = c.toString();
            while(s.length() < n){
                s = "0" + s;
            }
            System.out.println(s);
        }
    }
}
