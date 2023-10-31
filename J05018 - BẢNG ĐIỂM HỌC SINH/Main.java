package J05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        BangDiem[] a = new BangDiem[n];
        ArrayList<BangDiem> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String x = sc.nextLine();
            float[] d = new float[10];
            for(int j = 0; j < 10; j++){
                d[j] = sc.nextFloat();
            }
            a[i] = new BangDiem(i + 1, x, d);
            arr.add(a[i]);
            sc.nextLine();
        }
        Collections.sort(arr, new Comparator<BangDiem>(){
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                if(o2.diemTb() < o1.diemTb()) return -1;
                if(o1.diemTb() > o1.diemTb()) return 1;
                else{
                    return o1.getMa().compareTo(o2.getMa());
                }
            }
        });
        for(BangDiem x : arr){
            System.out.println(x);
        }
    }
}
