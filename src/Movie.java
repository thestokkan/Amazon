import java.util.List;

public class Movie extends Product {
  private final String title;
  private final MovieGenre genre;
  private String director;


  public Movie(long productId, int price, String type, String title,
               MovieGenre genre) {
    super(productId, price, type);
    this.title = title;
    this.genre = genre;
  }

  public Movie(long productId, int price, String type, String title,
               MovieGenre genre, String director) {
    super(productId, price, type);
    this.title = title;
    this.genre = genre;
    this.director = director;
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

    if (director != null) {
      System.out.println("Director: " + director);
    }
  }

  public String getTitle() {
    return title;
  }

  public MovieGenre getGenre() {
    return genre;
  }
}