package anotherHW;
public class Point {
    public double x, y; 
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }    
    public Point(Point p) {
        this.x = p.x; this.y = p.y;
    }   
    public double distanceTo(Point p) {
        return Math.sqrt((this.x - p.x ) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y ));
    }
}