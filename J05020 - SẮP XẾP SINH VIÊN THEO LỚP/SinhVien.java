package J05020;

public class SinhVien implements Comparable<SinhVien>{
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

    @Override
    public int compareTo(SinhVien o) {
        if(!this.lop.equals(o.lop)){
            return this.lop.compareTo(o.lop);
        }
        return this.ma.compareTo(o.ma);
    }
}
