import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Timer[] a = new Timer[n];
        ArrayList<Timer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a[i] = new Timer(sc.nextInt(), sc.nextInt(), sc.nextInt());
            arr.add(a[i]);
        }
        Collections.sort(arr, new Comparator<Timer>(){
            @Override
            public int compare(Timer o1, Timer o2) {
                return o1.getTime() - o2.getTime();
            }           
        });
        
        for(Timer x : arr){
            System.out.println(x);
        }
    }
}
