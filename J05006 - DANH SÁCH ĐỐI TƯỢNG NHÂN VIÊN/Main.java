package J05006;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        NhanVien[] a = new NhanVien[n];
        ArrayList<NhanVien> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String res = String.format("%05d", i + 1);
            a[i] = new NhanVien(res, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), sc.nextLine());
            arr.add(a[i]);
        }
        for(NhanVien x : arr){
            System.out.println(x);
        }
    }
}
