public class Fraction {
    private long numerator;
    private long denominator;

    public Fraction(){       
    } 
    
    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public Fraction gcd(Fraction cnt){
        long a = cnt.numerator;
        long b = cnt.denominator;
        while(b > 0){
            long res = a % b;
            a = b;
            b = res;
        }
        Fraction f = new Fraction();
        f.numerator = cnt.numerator / a;
        f.denominator = cnt.denominator / a;
        return f;
    }
    
    public Fraction sum(Fraction a){
        Fraction res = new Fraction();
        res.numerator = (a.numerator * this.denominator) + (this.numerator * a.denominator);
        res.denominator = this.denominator * a.denominator;
        return gcd(res);
    }
    
    public Fraction mul(Fraction a){
        Fraction res = new Fraction();
        res.numerator = this.numerator * a.numerator;
        res.denominator = this.denominator * a.denominator;
        return gcd(res);
    }
    
    @Override
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }
}
