package J05009;

public class ThiSinh {
    private String ma, ten, dob;
    private double d1, d2, d3;
    
    public ThiSinh(int ma, String ten, String dob, double d1, double d2, double d3){
        this.ma = String.valueOf(ma);
        this.ten = ten;
        this.dob = dob;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
    public double getDiem(){
        return d1 + d2 + d3;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.dob + " " + this.getDiem();
    }
}
