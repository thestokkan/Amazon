import java.util.Map;

public class LibraryBackend {

  public Movie createMovie(long productId, int price,
                           String type, String title, MovieGenre genre) {
    try {
      return new Movie(productId, price, type, title, genre);
    } catch (IncorrectProductIdException e) {
      System.err.println(e.getMessage());
      return null;
    }
  }

  public Movie createMovieWithDirector(long productId, int price,
                           String type, String title, MovieGenre genre,
                                       String director) {
    try {
      return new MovieWithDirector(productId, price, type, title, genre, director);
    } catch (IncorrectProductIdException e) {
      System.err.println(e.getMessage());
      return null;
    }
  }

  public Book createBook(long productId, int price,
                           String type, String title, String author) {
    try {
      return new Book(productId, price, type, title, author);
    } catch (IncorrectProductIdException e) {
      System.err.println(e.getMessage());
      return null;
    }
  }

  public Book createChildrensBook(long productId, int price,
                         String type, String title, String author,
                                  String recommendedFromAge) {
    try {
      return new ChildrensBook(productId, price, type, title, author, recommendedFromAge);
    } catch (IncorrectProductIdException e) {
      System.err.println(e.getMessage());
      return null;
    }
  }

  public Movie findMovieById(long productId, Map<Long, Movie> movies) {
    for (long key : movies.keySet()) {
      if (movies.get(key).matchID(productId)) {
        return movies.get(key);
      }
    }
    return null;
  }

  public void printSearchResults(Movie movieToFind, long idToFind) {
    System.out.println("Searching for movie with ID " + idToFind);

    if (movieToFind != null) {
      System.out.println("\nMovie found: ");
      movieToFind.printDetails();
    } else {
      System.out.println("\nCould not locate movie...");
    }
  }
}