
public class MatHang {
    private String ma, ten, donvi;
    private int giamua, giaban;

    public MatHang(int ma, String ten, String donvi, int giamua, int giaban) {
        this.ma = "MH" + String.format("%03d", ma);
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }
    
    public int getLoiNhuan(){
        return this.giaban - this.giamua;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.donvi + " " + this.giamua + " " + this.giaban + " " + this.getLoiNhuan();
    }
}
