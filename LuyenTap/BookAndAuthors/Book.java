package LuyenTap.BookAndAuthors;

public class Book {
    private String nameBook;
    private Author[] author;
    private double price;
    private int soTG;
    private int qty;

    public Book(String nameBook, double price,int qty,int soTG,Author[] author) {
        this.nameBook = nameBook;
        this.author = author;
        this.price = price;
        this.soTG = soTG;
        this.qty = qty;
    }


    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSoTG() {
        return soTG;
    }

    public void setSoTG(int soTG) {
        this.soTG = soTG;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public void display(int n){
        System.out.println("-----------------------");
        System.out.println("Book information :");
        System.out.println("Name : "+this.nameBook);
        System.out.println("Price : "+Math.round(this.price));
        System.out.println("Quantity : " + this.qty);
        System.out.println("Author information :");
        for(int i=0;i<n;i++){
            System.out.println("#"+(int)(i+1));
            System.out.println(author[i]);
        }

    }

}
