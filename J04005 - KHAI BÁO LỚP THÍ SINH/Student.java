
public class Student {
    private String name;
    private String birth;
    private double d1, d2, d3;
    
    public Student(){
    }

    public Student(String name, String birth, double d1, double d2, double d3) {
        this.name = name;
        this.birth = birth;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
      
    
    @Override
    public String toString(){
        return name + " " + birth + " " + String.format("%.1f", d1 + d2 + d3);
    }
}
