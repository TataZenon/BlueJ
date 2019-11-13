package anotherHW;
public class Circle {
    public Point p;
    public double r;  
    public Circle(Point x, double y) {
        this.p= new Point(x);
        this.r = y;
    }  
    public Circle(Circle c) {
        this(c.p, c.r);
    }
}