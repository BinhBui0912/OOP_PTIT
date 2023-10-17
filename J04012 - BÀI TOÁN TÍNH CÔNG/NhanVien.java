
public class NhanVien {
    private String ma, ten, chucvu;
    private int luong, ngay;
    
    public NhanVien(String ma, String ten, int luong, int ngay, String chucvu){
        this.ma = ma;
        this.luong = luong;
        this.ten = ten;
        this.ngay = ngay;
        this.chucvu = chucvu;
    }
    
    public int getPhuCap(){
        if(this.chucvu.equals("GD")) return 250000;
        else if(this.chucvu.equals("PGD")) return 200000;
        else if(this.chucvu.equals("TP")) return 180000;
        else return 150000;
    }
    
    public int getLuong(){
        return this.luong * this.ngay;
    }
    
    public int getThuong(){
        if(this.ngay >= 25) return this.getLuong() * 20/100;
        else if(this.ngay >= 22 && this.ngay < 25) return this.getLuong() * 10 / 100;
        else return 0;
    }
    
    public int getTong(){
        return this.getLuong() + this.getPhuCap() + this.getThuong();
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.getLuong() + " " + this.getThuong() + " " + this.getPhuCap() + " " + this.getTong();
    }
}
