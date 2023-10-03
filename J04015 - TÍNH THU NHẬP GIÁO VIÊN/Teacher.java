
public class Teacher {
    private String ma, ten;
    private int luong;

    public Teacher(String ma, String ten, int luong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
    }
    
    public int getPhuCap(){
        String res = "";
        res = ma.substring(0, 2);
        if(res.contains("HT")) return 2000000;
        else if(res.contains("HP")) return 900000;
        else return 500000;
    }
    
    public int getBac(){
        return Integer.parseInt(ma.substring(2));
    }
    
    public int getLuong(){
        return this.luong * getBac();
    }
    
    public int getTong(){
        return this.getLuong() + this.getPhuCap();
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.getBac() + " " + this.getPhuCap() + " " + this.getTong();
    }
}
