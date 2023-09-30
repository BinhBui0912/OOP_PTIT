
public class Point {
    private double x;
    private double y;
    private double dist;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY(){
        return this.x;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }
    
    public double distance(Point secondPoint){
        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2) + (Math.pow(this.y - secondPoint.y, 2)));
    }
    
    public double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + (Math.pow(p1.y - p2.y, 2)));
    }
    
    @Override
    public String toString(){
        return String.format("%.4f", dist);
    }
}
