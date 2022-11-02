import java.util.List;

public class Movie extends Product {
  private final String title;
  private final MovieGenre genre;
  private String director;


  public Movie(long productId, int price, String title, MovieGenre genre) {
    super(productId, price);
    this.title = title;
    this.genre = genre;
  }

  public Movie(long productId, int price, String title, MovieGenre genre,
               String director) {
    this(productId, price, title, genre);
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
}