import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        while(sc.hasNextLine()){
            int n = Integer.parseInt(sc.nextLine());
            MonThi[] a = new MonThi[n];
            ArrayList<MonThi> arr = new ArrayList<>();
            for(int i = 0; i < n; i++){
                a[i] = new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine());
                arr.add(a[i]);
            }
            Collections.sort(arr, new Comparator<MonThi>(){
                @Override
                public int compare(MonThi o1, MonThi o2) {
                    return o1.getMa().compareTo(o2.getMa());
                } 
            });
            for(MonThi x : arr){
                System.out.println(x);
            }
        }
    }
}
