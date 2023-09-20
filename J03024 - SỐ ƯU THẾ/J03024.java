import java.math.BigInteger;
import java.util.Scanner;

public class J03024 {
    public static boolean check1(String s){
        for(char x : s.toCharArray()){
            if(Character.isLetter(x))
                return false;
        }
        return true;
    }
    public static int check2(String s){
        int cnt1 = 0, cnt2 = 0;
        for(char x : s.toCharArray()){
            if((x - '0') % 2 == 0)
                cnt2++;
            else
                cnt1++;
        }
        if (cnt2 > cnt1) 
            return 2;
        else if (cnt2 == cnt1) 
            return 0;
        else 
            return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.next();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String s = sc.next();
            if(check1(s) == false){
                System.out.println("INVALID");
            }
            else{
                if(s.length() % 2 == 0){
                    if(check2(s) == 2)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                else{
                    if(check2(s) == 1){
                        System.out.println("YES");
                    }
                    else
                        System.out.println("NO");
                }
            }
        }
    }
}
