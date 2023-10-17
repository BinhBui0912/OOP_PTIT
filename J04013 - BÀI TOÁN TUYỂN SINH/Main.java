import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh a = new TuyenSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.print(a.getMa() + " " + a.getTen() + " ");
        if(a.getUuTien() == (int)a.getUuTien()){
            System.out.print((int)a.getUuTien());
        }
        else{
            System.out.printf("%.1f", a.getUuTien());
        }
        System.out.print(" ");
        if(a.getDiem() == (int)a.getDiem()){
            System.out.print((int)a.getDiem());
        }
        else{
            System.out.printf("%.1f", a.getDiem());
        }
        System.out.print(" ");
        if((a.getDiem() + a.getUuTien()) >= 24){
            System.out.print("TRUNG TUYEN");
        }
        else{
            System.out.print("TRUOT");
        }
    }
}

