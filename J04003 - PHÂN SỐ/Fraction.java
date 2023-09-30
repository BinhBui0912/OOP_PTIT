
public class Fraction {
    private long numerator;
    private long denominator;

    public Fraction() {
    }

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }
    
    public long gcd(){
        long a = numerator;
        long b = denominator;
        while(b > 0){
            long res = a % b;
            a = b;
            b = res;
        }
        return a;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
