package J05006;

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
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.sex + " " + this.dob + " " + this.address + " " + this.vat + " " + this.dos;
    }
}
