package J05011;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Gamer[] a = new Gamer[n];
        ArrayList<Gamer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a[i] = new Gamer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(a[i]);
        }
        Collections.sort(arr, new Comparator<Gamer>(){
            @Override
            public int compare(Gamer o1, Gamer o2) {
                return o2.getTime() - o1.getTime();
            }
        });
        for(Gamer x : arr){
            System.out.println(x);
        }
    }
}
