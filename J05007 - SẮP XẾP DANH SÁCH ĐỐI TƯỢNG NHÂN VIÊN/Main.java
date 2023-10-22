package J05007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        Collections.sort(arr, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if(o1.getNam() != o2.getNam()) return o1.getNam() - o2.getNam();
                if(o1.getThang() != o2.getThang()) return o1.getThang() - o2.getThang();
                return o1.getNgay() - o2.getNgay();
            }
            
        });
        for(NhanVien x : arr){
            System.out.println(x);
        }
    }
}
