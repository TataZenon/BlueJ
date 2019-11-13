package HelpMe;
public class TestBook{
 public static void main(String[] args) {
     Author [] author = new Author[4];
     author[0] = new Author("TataZenon", 21);
     author[1] = new Author("ZeNoZenoN", 18);
     author[2] = new Author("ZenonMaster", 35);
     author[3] = new Author("AxileZenon", 16);
     
     
     Author [] set1 = new Author[1];
     set1[0] = new Author("TataZenon", 21); 
     Book bookSet1 = new Book("Depression Of You", set1, 200);
     
     Author [] set2 = new Author[2];
     set2[0] = new Author("TataZenon", 21);
     set2[1] = new Author("ZenonMaster", 35);
     Book bookSet2 = new Book("Sadness of the guy mind", set2, 550);
     
     Author [] set3 = new Author[3];
     set3[0] = new Author("AxileZenon", 16);
     set3[1] = new Author("ZeNoZenoN", 18);
     set3[2] = new Author("ZenonMaster", 35);
     Book bookSet3 = new Book("How to be a best programmer", set3, 1100);
     
     Book [] booooookz = new Book[3];
     booooookz[0] = bookSet1;
     booooookz[1] = bookSet2;
     booooookz[2] = bookSet3;

    }
}
