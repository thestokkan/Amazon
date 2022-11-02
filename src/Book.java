public class Book {
  private final String title;
  private final String author;
  private int price;

  public Book(String title, String author, int price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void printBookDetails() {
    System.out.printf("%nTitle: %s%nAuthor: %s%nPrice: $%d%n", title,
                      author, price);
  }
}