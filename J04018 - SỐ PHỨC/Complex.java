public class Complex {
    private long realPart, virtualPart;
    
    public Complex(){
    }
    
    public Complex(long realPart, long virtualPart){
        this.realPart = realPart;
        this.virtualPart = virtualPart;
    }
    
    public Complex plus(Complex a){
        Complex res = new Complex();
        res.realPart = this.realPart + a.realPart;
        res.virtualPart = this.virtualPart + a.virtualPart;
        return res;
    }
    
    public Complex mul(Complex a){
        Complex res = new Complex();
        res.realPart = (this.realPart * a.realPart) - (this.virtualPart * a.virtualPart);
        res.virtualPart = (this.realPart * a.virtualPart) + (this.virtualPart * a.realPart);
        return res;
    }
    
    public String toString(){
        return this.realPart + " + " + this.virtualPart + "i";
    }
}
