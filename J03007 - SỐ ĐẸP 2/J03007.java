import java.util.Scanner;
public class J03007 {
    public static boolean tn8(String s){
        StringBuilder sb = new StringBuilder(s);
        if(s.charAt(0) != '8'|| s.charAt(s.length() - 1) != '8')
            return false;
        return sb.reverse().toString().equals(s);
    }
    public static boolean tongCs(String s){
        int tong = 0;
        for(char x : s.toCharArray()){
            tong += x - '0';
        }
        if(tong % 10 == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String s = sc.nextLine();
            if(tn8(s) && tongCs(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
