import java.util.Scanner;

public class J03032{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            for(String x : arr){
                StringBuilder sb = new StringBuilder(x);
                System.out.print(sb.reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
