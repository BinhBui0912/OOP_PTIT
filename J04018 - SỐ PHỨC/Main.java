
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            Complex a = new Complex(sc.nextLong(), sc.nextLong());
            Complex b = new Complex(sc.nextLong(), sc.nextLong());
            Complex c = (a.plus(b)).mul(a);
            Complex d = (a.plus(b)).mul(a.plus(b));
            System.out.println(c + ", " + d);
        }
    }
}
