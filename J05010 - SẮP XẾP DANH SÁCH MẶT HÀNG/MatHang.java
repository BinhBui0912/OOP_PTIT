package J05010;
public class MatHang {
    private String ma, ten,nhom;
    private double mua, ban;
    
    public MatHang(int ma, String ten, String nhom, double mua, double ban){
        this.ma = String.valueOf(ma);
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }
    
    public double getLoiNhuan(){
        return this.ban - this.mua;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.nhom + " " + String.format("%.2f", this.getLoiNhuan());
    }
}
