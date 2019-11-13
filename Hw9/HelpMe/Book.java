package HelpMe;
public class Book
{
    public String title;
    public Author[] author;
    public double price;
    public Book(String t, Author [] au, double p){
        this.title = t;
        this.author = au;
        this.price = p;
    }
    
    public static int countBookByAuthorsName(Book [] books, String name){
        int countBook = 0;
        String nameCheck = name;
        int amount = books.length;
        int countAuthor = 0;
        for(int i = 0; i < amount; i++){
            countAuthor = books[i].author.length;
            for(int j = 0; j < countAuthor; j++){
                if(nameCheck.equalsIgnoreCase(books[i].author[j].name)){
                    countBook++;
                }
            }
        }
        return countBook;
    }
    
    public static Author getFirstAuthorByBookTitle(Book [] books, String title){
        int bookCount = books.length;
        Author firstAuthor = new Author();
        for(int i = 0; i < bookCount; i++){
            if(title.equalsIgnoreCase(books[i].title)){
                firstAuthor = new Author(books[i].author[0].name, books[i].author[0].age);
            }
        }
        return firstAuthor;
    }
    
    public static Book [] getBookWhichManyAuthor(Book [] books){
        int checkCount = 0;
        for(int i = 0; i < books.length; i++){
            if(books[i].author.length >= 3){
                checkCount++;
            }
        }
        Book bookList [] = new Book[checkCount];
        int index = 0;
        if(checkCount > 0){
            for(int i = 0; i < books.length; i++){
                if(books[i].author.length >= 3){
                    bookList[index] = books[i];
                    index++;
                }
            }
        }
        return bookList;
    }
    
    public static void showBookByAuthor(Book [] books, Author [] authors){
        for(int k = 0; k < authors.length; k++){
            Author author = authors[k];
            System.out.println(author.name + " ");
            for(int u = 0; u < books.length; u++){
                Book book = books[u];
                Author [] bookAuthors = book.author;
                for(int y = 0; y < bookAuthors.length; y++){
                    Author bookAuthor = bookAuthors[y];
                    if(author.name.equals(bookAuthor.name)){
                        System.out.println(book.title + " " + book.price + "\t");
                    }
                }
            }
            System.out.println();
        }
    }
}

