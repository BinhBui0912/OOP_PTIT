package J05022;

import java.util.ArrayList;
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
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + s + ":");
            for(SinhVien x : arr){
                if(x.getLop().equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
