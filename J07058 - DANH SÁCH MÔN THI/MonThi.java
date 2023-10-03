
public class MonThi {
    private String ma, ten, hinhthuc;

    public MonThi(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }

    public String getMa() {
        return ma;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.hinhthuc;
    }
}
