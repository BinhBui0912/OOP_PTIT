import java.util.Scanner;
public class J03021{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String s = sc.next().toLowerCase();
            String tmp = "";
            for(char x : s.toCharArray()){
                if(x == 'a' || x == 'b' || x == 'c') tmp += "2";
                if(x == 'd' || x == 'e' || x == 'f') tmp += "3";
                if(x == 'g' || x == 'h' || x == 'i') tmp += "4";
                if(x == 'j' || x == 'k' || x == 'l') tmp += "5";
                if(x == 'm' || x == 'n' || x == 'o') tmp += "6";
                if(x == 'p' || x == 'q' || x == 'r' || x == 's') tmp += "7";
                if(x == 't' || x == 'u' || x == 'v') tmp += "8";
                if(x == 'w' || x == 'x' || x == 'y' || x == 'z') tmp += "9";
            }
            StringBuilder sb = new StringBuilder(tmp);
            if(sb.reverse().toString().equals(tmp))
                System.out.println("YES");
            else
                System.out.println("NO");            
        }
    }
}
