import java.util.ArrayList;
import java.util.Scanner;

public class J03038{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Character> arr = new ArrayList<>();
        for(char x : s.toCharArray()){
            if(!arr.contains(x)){
                arr.add(x);
            }
        }
        System.out.println(arr.size());
    }
}
