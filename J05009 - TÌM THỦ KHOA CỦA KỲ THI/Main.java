package J05009;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ThiSinh[] a = new ThiSinh[n];
        ArrayList<ThiSinh> arr = new ArrayList<>();
        double max_diem = 0;
        for(int i = 0; i < n; i++){
            a[i] = new ThiSinh(i + 1, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            if(a[i].getDiem() > max_diem) max_diem = a[i].getDiem();
            arr.add(a[i]);
        }
        for(ThiSinh x : arr){
            if(x.getDiem() == max_diem) System.out.println(x);
        }
    }
}
