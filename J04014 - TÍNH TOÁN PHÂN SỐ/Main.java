import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            Fraction a = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction b = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction c = (a.sum(b)).mul(a.sum(b));
            Fraction d = a.mul(b).mul(c);
            System.out.println(c + " " + d);
        }
    }
}
