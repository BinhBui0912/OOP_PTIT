
package J05024;

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
            s = s.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + s + ":");
            String[] ans = s.split("\\s+");
            String tmp = "";
            for(String x : ans){
                tmp += x.charAt(0);
            }
            tmp = tmp.substring(0, 2);
            for(SinhVien x : arr){
                if(tmp.equals("CN") || tmp.equals("AT")){
                    if(x.getLop().charAt(0) != 'E' && x.getMa().substring(5, 7).equals(tmp))
                        System.out.println(x);
                }
                else{
                    if(x.getMa().substring(5, 7).equals(tmp))
                        System.out.println(x);
                }
            }
        }
    }
}
