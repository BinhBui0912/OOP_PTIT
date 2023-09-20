import java.util.Scanner;
public class J03026{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();
            if(a.equals(b))
                System.out.println("-1");           
            else
                System.out.println(Math.max(a.length(), b.length()));         
        }
    }
}
