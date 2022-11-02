import java.util.List;

public class Movie {
  private final String title;
  private final MovieGenre genre;
  private int price;
  private String director;
  private long productId;


  public Movie(String title, MovieGenre genre, int price, long productId) {
    this.title = title;
    this.genre = genre;
    this.price = price;
    this.productId = productId;
  }

  public Movie(String title, MovieGenre genre, int price, long productId,
               String director) {
    this(title, genre, price, productId);
    this.director = director;
  }

  public boolean matchID(long productId) {
    return this.productId == productId;
  }

  public void printMovieDetails() {
    System.out.printf("Title: %s%nGenre: %s%nPrice: $%d%nProduct ID: %d%n",
                      title,
                      genre, price, productId);
    if (director != null) {
      System.out.printf("Director: %s", director);
    }
    System.out.println();
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

  public void setProductId(long productId) {
    this.productId = productId;
  }

}