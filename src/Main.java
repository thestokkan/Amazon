import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {

    Book book1 = new Book(2001, 45, "Book", "The great misfortune", "Noah " +
                                                                   "Lingiah");
    Book book2 = new Book(2002, 8, "Book", "Many strangers", "Liz Mangan");
    Book childrensBook1 =
            new ChildrensBook(2003, 32, "Book", "Peter Rabbit", "Beatrix " +
                                                               "Potter",
                              "4 years");

    Movie movie1 = new Movie(1001, 8, "Movie", "Hello Dolly", MovieGenre.COMEDY);
    Movie movie2 =
            new Movie(1002, 9, "Movie",  "Crisis upon crisis", MovieGenre.DOCUMENTARY);
    Movie movie3 = new MovieWithDirector(1003, 10, "Movie", "Lord of the Rings",
                             MovieGenre.ACTION,
                             "James Cameron");

    List<Product> products = new ArrayList<>();
    products.add(book1);
    products.add(book2);
    products.add(childrensBook1);
    products.add(movie1);
    products.add(movie2);
    products.add(movie3);

    System.out.println("\n=== PRODUCT DETAILS ===");
    for (Product p : products) {
      p.printDetails();
      System.out.println();
    }

    // Movies in hashmap
    Map<Long, Movie> movies = new HashMap<>();
    movies.put(movie1.getProductId(), movie1);
    movies.put(movie2.getProductId(), movie2);
    movies.put(movie3.getProductId(), movie3);

//    for (long key : movies.keySet()) {
//      movies.get(key).printDetails();
//    }

    System.out.println("\n=== SEARCH BY ID ===");
    Movie movieToFind = findMovieById(1005, movies);
    printSearchResults(movieToFind, 1005);

    Movie secondMovieToFind = findMovieById(1003, movies);
    printSearchResults(secondMovieToFind, 1003);
  }

  private static void printSearchResults(Movie movieToFind, long idToFind) {
    System.out.println("Searching for movie with ID " + idToFind);

    if (movieToFind != null) {
      System.out.println("\nMovie found: ");
      movieToFind.printDetails();
    } else {
      System.out.println("\nCould not locate movie...");
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