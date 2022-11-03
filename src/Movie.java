public class Movie implements Product, Comparable<Movie> {
  private final long productId;
  private int price;
  private final String type;
  protected final String title;
  protected final MovieGenre genre;

  public Movie(long productId, int price, String type, String title,
               MovieGenre genre) {
    this.productId = productId;
    this.price = price;
    this.type = type;
    this.title = title;
    this.genre = genre;
  }

  public boolean matchID(long productId) {
    return this.productId == productId;
  }

  @Override
  public int compareTo(Movie movie) {
      if (this.productId == movie.productId) return 0;
      return this.productId < movie.productId ? -1 : 1;
  }

  @Override
  public void printDetails() {
    System.out.println("ID: " + productId);
    System.out.println("Type: " + type);
    System.out.println("Price: " + price);
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

  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }

  public long getProductId() {
    return productId;
  }
}