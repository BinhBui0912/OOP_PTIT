
public class Timer {
    private int gio, phut, giay;

    public Timer(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    
    public int getTime(){
        return this.gio * 3600 + this.phut * 60 + this.giay;
    }
    
    @Override
    public String toString(){
        return this.gio + " " + this.phut + " " + this.giay;
    }
}
