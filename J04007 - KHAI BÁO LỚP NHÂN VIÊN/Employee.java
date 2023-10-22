
public class Employee {
    private String mnv, name, sex, birth, address, vat, day;

    public Employee(String mnv, String name, String sex, String birth, String address, String vat, String day) {
        this.mnv = mnv;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.vat = vat;
        this.day = day;
    }
    
    public void chuanHoa(){
        StringBuilder sb1 = new StringBuilder(birth);
        if(sb1.charAt(1) == '/') sb1.insert(0, "0");
        if(sb1.charAt(4) == '/') sb1.insert(3, "0");
        this.birth = sb1.toString();
        StringBuilder sb2 = new StringBuilder(day);
        if(sb2.charAt(1) == '/') sb2.insert(0, "0");
        if(sb2.charAt(4) == '/') sb2.insert(3, "0");
    }
    
    @Override
    public String toString(){
        return mnv + " " + name + " " + sex + " " + birth + " " + address + " " + vat + " " + day;
    }
}
