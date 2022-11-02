import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {

    System.out.println("\nBOOK SECTION");
    System.out.println("==============");
    Book book1 = new Book(2001, 45, "The great misfortune", "Noah Lingiah");
    Book book2 = new Book(2002, 8, "Many strangers", "Liz Mangan");

    List<Book> books = new ArrayList<Book>();
    books.add(book1);
    books.add(book2);

    System.out.println("\nPrinting book object: " + book1);

    Book peterRabbit =
            new ChildrensBook(2003, 32, "Peter Rabbit", "Beatrix " + "Potter",
                              "From 4 years");
    books.add(peterRabbit);

    for (Book book : books) {
      book.printBookDetails();
    }

    System.out.println("\nMOVIE SECTION");
    System.out.println("==============");
    Movie movie1 = new Movie(1001, 8, "Hello Dolly", MovieGenre.COMEDY);
    Movie movie2 =
            new Movie(1002, 9, "Crisis upon crisis", MovieGenre.DOCUMENTARY);
    Movie movie3 = new Movie(1003, 10, "Lord of the Rings", MovieGenre.ACTION,
                             "James Cameron");


    Map<Long, Movie> movies = new HashMap<>();
    movies.put(movie1.getProductId(), movie1);
    movies.put(movie2.getProductId(), movie2);
    movies.put(movie3.getProductId(), movie3);

    for (long key : movies.keySet()) {
      movies.get(key).printMovieDetails();
    }

    // Search for movie by ID
    Movie movieToFind = findMovieById(1005, movies);
    printSearchResults(movieToFind, 1005);

    Movie secondMovieToFind = findMovieById(1003, movies);
    printSearchResults(secondMovieToFind, 1003);
  }

  private static void printSearchResults(Movie movieToFind, long idToFind) {
    System.out.println("\n\nSearching for movie with ID " + idToFind);

    if (movieToFind != null) {
      System.out.println("Movie found: ");
      movieToFind.printMovieDetails();
    } else {
      System.out.println("Could not locate movie...");
    }
  }


  public static Movie findMovieById(long productId, Map<Long, Movie> movies) {
    for (long key : movies.keySet()) {
      if (movies.get(key).matchID(productId)) {
        return movies.get(key);
      }
    }
    return null;
  }
}