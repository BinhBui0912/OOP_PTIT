import java.util.Scanner;
public class J03006 {
    public static boolean tn(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
    public static boolean chanLe(String s){
        for(char x : s.toCharArray()){
            if((x - '0') % 2 == 1)
                return false;       
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String s = sc.nextLine();
            if(tn(s) && chanLe(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
