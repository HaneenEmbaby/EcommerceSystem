public class BookProduct extends Product {
    String Author;
    String Publisher;
    public BookProduct (String name, int ID, float price, String author , String publisher) {
        Name = name;
        productID = ID;
        Price = price;
        Author = author;
        Publisher = publisher;
    }
    public void setAuthor (String a){
        this.Author = a;
    }
    public String getAuthor(){
        return Author;
    }
    public void setPublisher (String p){
        this.Publisher = p;
    }
    public String getPublisher(){
        return Publisher;
    }
}
