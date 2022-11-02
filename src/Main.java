import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Book book1 = new Book("The great misfortune", "Noah Lingiah", 45);
    Book book2 = new Book("Many strangers", "Liz Mangan", 8);

    List<Book> books = new ArrayList<Book>();
    books.add(book1);
    books.add(book2);

    for (Book book : books) {
      book.printBookDetails();
    }

    Movie movie1 = new Movie("Hello Dolly", MovieGenre.COMEDY, 8, 1001);
    Movie movie2 = new Movie("Crisis upon crisis", MovieGenre.DOCUMENTARY, 9,
                             1002);
    Movie movie3 = new Movie("Lord of the Rings", MovieGenre.ACTION, 10, 1003,
                             "James Cameron");

    List<Movie> movies = new ArrayList<Movie>();
    movies.add(movie1);
    movies.add(movie2);
    movies.add(movie3);

    for (Movie movie : movies) {
      movie.printMovieDetails();
    }

    // Search for movie by ID
    long idToFind = 1005;
    System.out.println("\n\nSearching for movie with ID " + idToFind);
    Movie movieToFind = findMovieById(idToFind, movies);
    if (movieToFind != null) {
      System.out.println("Movie found: ");
      movieToFind.printMovieDetails();
    } else {
      System.out.println("Could not locate movie...");
    }

  }

  public static Movie findMovieById(long productId, List<Movie>  movies) {
    for (Movie movie :
            movies) {
      if (movie.matchID(productId)) {
        return movie;
      }
    }
    return null;
  }
}