import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int test = Integer.parseInt(t);
        MatHang[] a = new MatHang[test];
        ArrayList<MatHang> arr = new ArrayList<>();
        for(int i = 0; i < test; i++){
            a[i] = new MatHang(i + 1, sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arr.add(a[i]);
        }
        Collections.sort(arr, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
               return o2.getLoiNhuan() - o1.getLoiNhuan();
            }      
        });
        for(MatHang x : arr){
            System.out.println(x);
        }
    }
}
