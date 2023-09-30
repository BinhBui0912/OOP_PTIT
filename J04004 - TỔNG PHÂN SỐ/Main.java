import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction a = new Fraction(sc.nextLong(), sc.nextLong());
        Fraction b = new Fraction(sc.nextLong(), sc.nextLong());
        Fraction f = a.result(a, b);
        Fraction g = new Fraction();
        g.setNumerator(f.getNumerator() / f.gcd());
        g.setDenominator(f.getDenominator() / f.gcd());
        System.out.println(g);
    }
}
