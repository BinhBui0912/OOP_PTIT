package J05005;
public class Student {
    private String ma, ten, lop, dob;
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

    public double getGpa() {
        return gpa;
    }
    
    public void chuanHoa1(){
        this.ten = this.ten.trim();
        String res = "";
        String[] arr = this.ten.split("\\s+");
        for(String x : arr){
            res += Character.toUpperCase(x.charAt(0));
            for(int i = 1; i < x.length(); i++){
                res += Character.toLowerCase(x.charAt(i));
            }
            res += " ";
        }
        this.ten = res.trim();
    }
    
    public void chuanHoa2(){
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
