<<<<<<< HEAD
import java.util.*;

=======
import java.util.Scanner;
import java.util.TreeSet;
>>>>>>> 9d62aa7794ad98970955eebb1e3b400a43c3549d
public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            TreeSet<String> set = new TreeSet<>();
            TreeSet<String> set2 = new TreeSet<>();
            String[] arr = b.split("\\s+");
            for(String x : arr){
                set.add(x);
            }
            String[] arr2 = a.split("\\s+");
            for(String x : arr2){
                if(!set.contains(x))
                    set2.add(x);
            }
            for(String x : set2){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
