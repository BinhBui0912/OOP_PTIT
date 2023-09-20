
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class J03004 {
    public static String chuanHoa(String s){
        String res = "";
        s = s.trim();
        String[] arr = s.split("\\s+");
        for(String x : arr){
            res += Character.toUpperCase(x.charAt(0));
            for(int i = 1; i < x.length(); i++){
                res += Character.toLowerCase(x.charAt(i));
            }
            res += " ";
        }
        return res.trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String S = sc.nextLine();
            System.out.println(chuanHoa(S));
        }
    }       
}
