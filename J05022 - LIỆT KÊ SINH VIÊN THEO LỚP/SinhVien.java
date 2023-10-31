package J05022;

public class SinhVien {
    private String ma, ten, lop, mail;
    
    public SinhVien(String ma, String ten, String lop, String mail){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }
    
    public String getLop(){
        return this.lop;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + this.mail;
    }
}
