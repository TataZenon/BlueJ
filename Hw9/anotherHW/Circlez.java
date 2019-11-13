package anotherHW;
public class Circlez {
    private double x;
    private double y;
    private double r;
    public Circlez(double x, double y, double r){
        this.x = x; 
        this.y = y; 
        this.r = r;
    }
    public Circlez(){
        this.x = 0.0; 
        this.y = 0.0; 
        this.r = 0.0;
    }
    public Circlez(Circlez c){
        this.x = c.x; 
        this.y = c.y; 
        this.r = c.r;
    }
    public double distanceTo(Circlez c){
        return Math.sqrt((this.x - c.x) * (this.x - c.x) + (this.y - c.y) * (this.y - c.y));
    }
    public boolean isInCircle(Circlez c){
        return c.distanceTo(c) + c.r == this.r || c.r > c.distanceTo(c) + c.r && this.r >= c.r;
    }
    public boolean isIntersected(Circlez c){
        return (c.distanceTo(c) <= (this.r + c.r));
    }
    public boolean equals(Circlez c){
        return (this.x == c.x ) && (this.y == c.y) && (this.r == c.r);
    }
}

