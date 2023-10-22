package J05004;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Student[] a = new Student[n];
        ArrayList<Student> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String res = "B20DCCN" + String.format("%03d", i + 1);
            a[i] = new Student(res, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            a[i].chuanHoa1();
            a[i].chuanHoa2();
            arr.add(a[i]);
        }
        for(Student x : arr){
            System.out.println(x);
        }
    }
}
