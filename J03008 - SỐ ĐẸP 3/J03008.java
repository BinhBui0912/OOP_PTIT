import java.util.Scanner;
public class J03008 {
    public static boolean tn(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
    public static boolean snt(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static boolean check(String s){
        for(char x : s.toCharArray()){
            if(snt(x - '0') == false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String s = sc.nextLine();
            if(tn(s) && check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
