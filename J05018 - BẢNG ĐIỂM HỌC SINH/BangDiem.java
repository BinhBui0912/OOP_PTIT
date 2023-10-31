package J05018;

public class BangDiem {
    private String ma, ten;
    private float[] diem;
    
    public BangDiem(int ma, String ten, float[] diem){
        this.ma = "HS" + String.format("%02d", ma);
        this.ten = ten;
        this.diem = diem;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    public float diemTb(){
        float tong = (diem[0] + diem[1]) * 2;
        for(int i = 2; i < this.diem.length; i++){
            tong += diem[i];
        }
        tong = tong / 12;
        return (float) (Math.round(tong * 10) / 10.0);
    }
    
    public String xepLoai(){
        if(diemTb() >= 9) return "XUAT SAC";
        if(diemTb() >= 8 && diemTb() < 9) return "GIOI";
        if(diemTb() >= 7 && diemTb() < 8) return "KHA";
        if(diemTb() >= 5 && diemTb() < 7) return "TB";
        return "YEU";
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + String.format("%.1f", this.diemTb()) + " " + this.xepLoai();
    }
}
