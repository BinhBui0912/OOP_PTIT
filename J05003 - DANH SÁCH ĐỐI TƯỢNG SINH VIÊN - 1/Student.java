package J05003;

public class Student {
    private String ma, ten, dob, lop;
    private double gpa;
    
    public Student(){
    }
    
    public Student(String ma, String ten, String lop, String dob, double gpa){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.dob = dob;
        this.gpa = gpa;
    }
    
    public void chuanHoa(){
        StringBuilder sb = new StringBuilder(this.dob);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        this.dob = sb.toString();
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + this.dob + " " + String.format("%.2f", this.gpa);
    }
}
