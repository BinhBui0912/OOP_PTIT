import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double ab = a.distance(b);
            double bc = b.distance(c);
            double ca = c.distance(a);
            if(ab + bc <= ca || bc + ca <= ab || ab + ca <= bc){
                System.out.println("INVALID");
            }
            else{
                double S =  Math.sqrt((ab + bc + ca) * (ab + bc - ca) * (- ab + bc + ca ) * (ab - bc + ca)) / 4;
                double R = (ab * bc * ca) / (4 * S);
                System.out.printf("%.3f", Math.PI * Math.pow(R, 2));
                System.out.println();
            }
        }
    }
}
