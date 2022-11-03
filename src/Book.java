public class Book implements Product, Comparable<Book> {
  private long productId;
  private int price;
  private final String type;
  private final String title;
  private final String author;

  public Book(long productId, int price, String type, String title,
              String author) throws Exception {
    if (productId >= 0) {
      this.productId = productId;
    } else {
      throw new Exception("Product ID cannot be negative. Book not created " +
                          "for ID " + productId);
    }

    this.price = price;
    this.type = type;
    this.title = title;
    this.author = author;
  }

  @Override
  public void printDetails() {
    System.out.println("ID: " + productId);
    System.out.println("Type: " + type);
    System.out.println("Price: " + price);
    printBookDetails();
  }

  public void printBookDetails() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
  }

  @Override
  public int compareTo(Book book) {
    if (book != null) {
      return Long.compare(this.productId, book.productId);
    }
    return -1;
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

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}