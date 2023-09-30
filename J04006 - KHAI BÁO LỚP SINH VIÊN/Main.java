
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student a = new Student("B20DCCN001", sc.nextLine(), sc.next(), sc.next(), sc.nextDouble());
        a.chuanHoa();
        System.out.println(a);
    }
}
