package J05020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] a = new SinhVien[n];
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(a[i]);
        }
        Collections.sort(arr);
        for(SinhVien x : arr){
            System.out.println(x);
        }
    }
}
