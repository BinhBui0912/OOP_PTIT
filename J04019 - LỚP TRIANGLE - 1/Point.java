package J04019;


import java.util.Scanner;

public class Point {
    private double x, y;
    
    
    public Point(){
        
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public static Point nextPoint(Scanner sc){
        Point X = new Point(sc.nextDouble(), sc.nextDouble());
        return X;
    }   
    
    public double getX() {
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public double distance(Point secondPoint){
        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2) + (Math.pow(this.y - secondPoint.y, 2)));
    }
    
}
