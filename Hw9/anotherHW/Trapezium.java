package anotherHW;
public class Trapezium {
    public Point a, b, c, d;
    public Trapezium(Point w, Point x, Point y, Point z) {
        this.a = new Point (w);
        this.b = new Point (x);
        this.c = new Point (y);
        this.d = new Point (z);
    }   
    public Trapezium(Trapezium t) {       
         this(t.a, t.b, t.c, t.d);
    }
        public static boolean isTrapeziumInCircle(Trapezium t, Circle c){
        return  c.p.distanceTo(t.a) <= c.r && c.p.distanceTo(t.b) <= c.r &&  c.p.distanceTo(t.c) <= c.r && c.p.distanceTo(t.d) <= c.r;
    }
    public static double getTrapeziumBorder(Trapezium t){
        return  t.a.distanceTo(t.b) + 
                t.b.distanceTo(t.c) + 
                t.c.distanceTo(t.d) + 
                t.d.distanceTo(t.a);
    }
}