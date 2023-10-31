package J05011;

public class Gamer {
    private String ma, ten, giovao, giora;

    public Gamer(String ma, String ten, String giovao, String giora) {
        this.ma = ma;
        this.ten = ten;
        this.giovao = giovao;
        this.giora = giora;
    }
    
    public int getTime(){
        int timevao = Integer.parseInt(giovao.substring(0,2)) * 60 + Integer.parseInt(giovao.substring(3));
        int timera = Integer.parseInt(giora.substring(0,2)) * 60 + Integer.parseInt(giora.substring(3));
        return timera - timevao;
    }
    
    public int getGio(){
        return this.getTime() / 60;
    }
    
    public int getPhut(){
        return this.getTime() - this.getGio() * 60;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.getGio() + " gio " + this.getPhut() + " phut";
    }
}
