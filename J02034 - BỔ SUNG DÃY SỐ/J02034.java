import java.util.Scanner;
/**
 *
 * @author Duy Binh
 */
public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] cnt = new int[201];
        int flag = 0, max_value = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            cnt[a[i]]++;
            max_value = Math.max(max_value, a[i]);
        }
        for(int i = 1; i <= max_value; i++){
            if(cnt[i] == 0){
                flag = 1;
                System.out.println(i);
            }
        }
        if(flag == 0) 
            System.out.println("Excellent!");
    }
}
