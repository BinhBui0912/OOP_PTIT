import java.util.Scanner;
public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            String[] arr = s.split("\\s+");
            StringBuilder sb = new StringBuilder("");
            for(int i = 1; i < arr.length; i++){
                String tmp = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
                sb.append(tmp).append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(", ");
            sb.append(arr[0].toUpperCase());
            System.out.println(sb.toString());
        }
    }
}
