
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

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }
    
    public long gcd(){
        long a = this.numerator;
        long b = this.denominator;
        while(b > 0){
            long res = a % b;
            a = b;
            b = res;
        }
        return a;
    }
    
    public Fraction result(Fraction a, Fraction b){
        Fraction f = new Fraction();
        f.numerator = (a.numerator * b.denominator) + (b.numerator * a.denominator);
        f.denominator = a.denominator * b.denominator;
        return f;
    }
    
    @Override
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }
}
