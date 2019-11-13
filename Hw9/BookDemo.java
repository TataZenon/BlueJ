public class BookDemo{
    public static void main(String[] args) {
        String title = "League of Legend";
        String [] author = {"Riot"};
        double price = 1200.25;
        int year = 2019;
        Book obj = new Book(title, author, price, year);

        System.out.println(title + " book is sell 20%");
        System.out.println("Price = " + obj.getPriceAtferDiscount(20.0));
    }
}