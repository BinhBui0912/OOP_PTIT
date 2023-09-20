import java.util.Scanner;
import java.util.Stack;
public class J03027{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        st.push(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(!st.isEmpty() && st.peek() == arr[i])
                st.pop();
            else
                st.push(arr[i]);
        }
        String tmp = "";
        if(st.isEmpty())
            System.out.println("Empty String");
        else{
            while(!st.isEmpty()){
                tmp = st.peek() + tmp;
                st.pop();
            }
            System.out.println(tmp);
        }
    }
}
