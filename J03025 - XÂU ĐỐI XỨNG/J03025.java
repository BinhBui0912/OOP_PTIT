import java.util.Scanner;
public class J03025{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String s = sc.next();
            int cnt = 0;
            int l = 0, r = s.length() - 1;
            while(l <= r){
                if(s.charAt(l) != s.charAt(r))
                    cnt++;
                if(cnt > 1)
                    break;
                l++; r--;
            }
            if(cnt > 1){
                System.out.println("NO");
            }
            else if(cnt == 0){
                if(s.length() % 2 == 1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
                System.out.println("YES");
        }      
    }
}
