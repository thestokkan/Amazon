public class Book extends Product {
  private final String title;
  private final String author;

  public Book(long productId, int price, String type, String title,
              String author) {
    super(productId, price, type);
    this.title = title;
    this.author = author;
  }

  @Override
  public void printDetails() {
    super.printDetails();
    printBookDetails();
  }

  public void printBookDetails() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
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
}