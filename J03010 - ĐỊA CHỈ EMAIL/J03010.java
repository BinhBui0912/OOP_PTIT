import java.util.HashMap;
import java.util.Scanner;

public class J03010 {
    static HashMap<String, Integer> map = new HashMap<>();
    public static String chuanHoa(String s){
        s = s.trim().toLowerCase();
        String[] arr = s.split("\\s+");
        String tmp = "";
        tmp += arr[arr.length - 1];
        for(int i = 0; i < arr.length - 1; i++){
            tmp += arr[i].substring(0, 1);
        }
        if(!map.containsKey(tmp)){
            map.put(tmp, 1);
        }
        else{
            int tansuat = map.get(tmp);
            map.put(tmp, tansuat + 1);
        }
        if(map.get(tmp) > 1){
            tmp += map.get(tmp).toString();
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
