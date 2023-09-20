import java.math.BigInteger;
import java.util.Scanner;

public class J03040{
    public static boolean check(String s){
        char[] arr = s.toCharArray();
        if(arr[5] == arr[6] && arr[6] == arr[7] && arr[7] == arr[9] && arr[9] == arr[10])
            return true;
        if(arr[5] < arr[6] && arr[6] < arr[7] && arr[7] < arr[9] && arr[9] < arr[10]) 
            return true;
        if(arr[5] == arr[6] && arr[6] == arr[7] && arr[9] == arr[10])
            return true;
        int ok = 1;
        for(int i = 5; i < arr.length; i++){
            if(i != 8){
                if(arr[i] != '6' && arr[i] != '8'){
                    ok = 0;
                    break;
                }
            }
        }      
        if(ok == 1) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String s = sc.nextLine();         
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
