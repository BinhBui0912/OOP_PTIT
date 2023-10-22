package J05010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MatHang[] a = new MatHang[n];
        ArrayList<MatHang> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a[i] = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(a[i]);
        }
        Collections.sort(arr, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return Double.compare(o2.getLoiNhuan(), o1.getLoiNhuan());
            }
            
        });
        for(MatHang x : arr){
            System.out.println(x);
        }
    }
}
