public class Book{
    private String title;
    private String[]author;
    private double price;
    private int year;

    public Book(String t, String [] a, double p, int y){
        this.title = t;
        this.author = a;
        this.price = p;
        this.year = y;
    }
    public double getPriceAtferDiscount(double discount){
        return this.price - (this.price * (discount / 100));
    }
}