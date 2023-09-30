import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange a = new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
        if(a.getWidth() > 0 && a.getHeight() > 0){
            StringBuilder sb = new StringBuilder(a.getColor().toLowerCase());
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            System.out.println((int)a.findPerimeter() + " " + (int)a.findArea() + " " + sb.toString());
        }
        else{
            System.out.println("INVALID");
        }
    }
}
