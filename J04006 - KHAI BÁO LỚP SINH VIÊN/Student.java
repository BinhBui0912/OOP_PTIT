
public class Student {
    private String name, birth, msv, lop;
    private double gpa;
    
    public Student(){
        this.name = "";
        this.birth = "";
        this.lop = "";
        this.msv = "";
        this.gpa = 0;
    }
    public Student(String msv, String name, String lop, String birth, double gpa) {
        this.name = name;
        this.birth = birth;
        this.msv = msv;
        this.lop = lop;
        this.gpa = gpa;
    }

    public void chuanHoa(){
        StringBuilder sb = new StringBuilder(birth);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        this.birth = sb.toString();
    }
    
    @Override
    public String toString(){
        return msv + " " + name + " " + lop + " " + birth + " " + String.format("%.2f", gpa);
    }
}
