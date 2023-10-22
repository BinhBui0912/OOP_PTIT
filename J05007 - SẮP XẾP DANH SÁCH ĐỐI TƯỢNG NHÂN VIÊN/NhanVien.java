package J05007;

public class NhanVien {
    private String ma, ten, sex, dob, address, dos;
    private long vat;

    public NhanVien(String ma, String ten, String sex, String dob, String address, long vat, String dos) {
        this.ma = ma;
        this.ten = ten;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
        this.dos = dos;
        this.vat = vat;
    }
    
    public int getNam(){
        return Integer.parseInt(this.dob.substring(6));
    }
    
    public int getThang(){
        return Integer.parseInt(this.dob.substring(3, 5));
    }
    
    public int getNgay(){
        return Integer.parseInt(this.dob.substring(0, 2));
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.sex + " " + this.dob + " " + this.address + " " + this.vat + " " + this.dos;
    }
}
