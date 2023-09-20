import java.util.Scanner;
public class J03010 {
    public static String chuanHoa(String s){
        s = s.trim().toLowerCase();
        String[] arr = s.split("\\s+");
        String tmp = "";
        tmp += arr[arr.length - 1];
        for(int i = 0; i < arr.length - 1; i++){
            tmp += arr[i].substring(0, 1);
        }
        tmp += "@ptit.edu.vn";
        return tmp.trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }
}
