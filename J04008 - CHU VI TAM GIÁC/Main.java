import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double ab = a.distance(b);
            double bc = b.distance(c);
            double ac = c.distance(a);
            if(ab + bc <= ac || bc + ac <= ab || ab + ac <= bc){
                System.out.println("INVALID");
            }
            else{
                System.out.printf("%.3f", ab + bc + ac);
                System.out.println();
            }
        }
    }
}
