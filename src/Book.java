public class Book extends Product {
  private final String title;
  private final String author;

  public Book(long productId, int price, String title, String author) {
    super(productId, price);
    this.title = title;
    this.author = author;
  }

  @Override
  public String toString() {
    return String.format("%s, %s, %d", title, author, price);
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public void printBookDetails() {
    System.out.printf("%nTitle: %s%nAuthor: %s%nPrice: $%d%n", title,
                      author, price);
  }
}