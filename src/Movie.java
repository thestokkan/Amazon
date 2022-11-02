public class Movie extends Product {
  protected final String title;
  protected final MovieGenre genre;

  public Movie(long productId, int price, String type, String title,
               MovieGenre genre) {
    super(productId, price, type);
    this.title = title;
    this.genre = genre;
  }

  public boolean matchID(long productId) {
    return this.productId == productId;
  }
  @Override
  public void printDetails() {
    super.printDetails();
    printMovieDetails();
  }

  public void printMovieDetails() {
    System.out.println("Title: " + title);
    System.out.println("Genre: " + genre);
  }

  public String getTitle() {
    return title;
  }

  public MovieGenre getGenre() {
    return genre;
  }
}