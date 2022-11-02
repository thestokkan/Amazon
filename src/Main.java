import java.util.*;

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

    Map<Long, Movie> movies = new HashMap<>();
    movies.put(movie1.getProductId(), movie1);
    movies.put(movie2.getProductId(), movie2);
    movies.put(movie3.getProductId(), movie3);

    for (long key : movies.keySet()) {
      movies.get(key).printMovieDetails();
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

  public static Movie findMovieById(long productId, Map<Long, Movie>  movies) {
    for (long key :
            movies.keySet()) {
      if (movies.get(key).matchID(productId)) {
        return movies.get(key);
      }
    }
    return null;
  }
}