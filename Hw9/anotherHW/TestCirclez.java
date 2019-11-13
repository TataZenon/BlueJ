package anotherHW;
public class TestCirclez{
    public static void main(String[] args) {
        Circlez a = new Circlez(0.0, 0.0, 10.0);
        Circlez b = new Circlez(-1.0, 2.0, 5.0);
        Circlez c = new Circlez(6.0, -4.0, 15.0);
        Circlez d = new Circlez(new Circlez(c));
        System.out.println("Distance of a and b = " + (double)a.distanceTo(b));
        System.out.println("Is d int b = " + d.isInCircle(b));
        System.out.println("Intersect of c and a = " + c.isIntersected(a));
        System.out.println("Is a equal to b = " + d.equals(c));
    }
}

