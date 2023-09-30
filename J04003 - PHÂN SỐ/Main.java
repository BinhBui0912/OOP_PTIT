import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction a = new Fraction(sc.nextLong(), sc.nextLong());
        Fraction f = new Fraction();
        f.setNumerator(a.getNumerator() / a.gcd());
        f.setDenominator(a.getDenominator() / a.gcd());
        System.out.println(f);
    }
}
