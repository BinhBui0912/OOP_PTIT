
public class TuyenSinh {
    private String ma, ten;
    private double toan, ly, hoa;

    public TuyenSinh(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    public double getUuTien(){
        String res = this.ma.substring(0, 3);
        if(res.equals("KV1")) return 0.5;
        else if(res.equals("KV2")) return 1;
        else return 2.5;
    }
    
    public double getDiem(){
        return this.toan * 2 + this.ly + this.hoa;
    }
    
    public double getTong(){
        return this.getDiem() + this.getUuTien();
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
}
