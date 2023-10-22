package J05005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        Collections.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                if(o2.getGpa() < o1.getGpa())
                    return -1;
                else
                    return 1;
            }
            
        });
        for(Student x : arr){
            System.out.println(x);
        }
    }
}
/*
2
ngUYen Van NaM
D20DCCN01-B
2/12/1994
2.17
Nguyen QuanG hAi
D20DCCN02-B
1/9/1994
3.0
*/