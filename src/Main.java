import java.util.*;

public class Main {
  public static void main(String[] args) {

    LibraryBackend b = new LibraryBackend();

    Book book1 = b.createBook(-1, 45, "Book", "The great misfortune", "Noah " +
                                                                  "Smith");
    Book book2 = b.createBook(2002, 8, "Book", "Many strangers", "Liz Mangan");
    Book childrensBook1 =
            b.createChildrensBook(2003, 32, "Book", "Peter Rabbit", "Beatrix " +
                                                                "Potter",
                              "4 years");

    Movie movie1 = b.createMovie(1001, 8, "Movie", "Hello Dolly",
                                 MovieGenre.COMEDY);
    Movie movie2 =
            b.createMovie(-1002, 9, "Movie", "Crisis upon crisis",
                          MovieGenre.DOCUMENTARY);
    Movie movie3 = b.createMovieWithDirector(1003, 10, "Movie", "Lord of the Rings",
                                         MovieGenre.ACTION,
                                         "James Cameron");

    List<Book> books = new ArrayList<>();
    books.add(book1);
    books.add(book2);
    books.add(childrensBook1);

    while (books.remove(null));

    List<Movie> movieList = new ArrayList<>();
    movieList.add(movie3);
    movieList.add(movie1);
    movieList.add(movie2);

    while (movieList.remove(null));

    Set<Product> products = new HashSet<>(movieList);
    products.addAll(books);

    System.out.println("\n=== PRODUCT DETAILS ===");
    for (Product p : products) {
        p.printDetails();
        System.out.println();
    }

//    System.out.println("\n=== MOVIE DETAILS ===");
//    Collections.sort(movieList);

//    for (Product m : movieList) {
//      if (m != null) {
//        m.printDetails();
//        System.out.println();
//      }
//    }

//    // Movies in hashmap
//    Map<Long, Movie> movies = new HashMap<>();
//    movies.put(movie1.getProductId(), movie1);
//    movies.put(movie2.getProductId(), movie2);
//    movies.put(movie3.getProductId(), movie3);

//    for (long key : movies.keySet()) {
//      movies.get(key).printDetails();
//    }

//    System.out.println("\n=== SEARCH BY ID ===");
//    Movie movieToFind = b.findMovieById(1005, movies);
//    b.printSearchResults(movieToFind, 1005);

//    Movie secondMovieToFind = b.findMovieById(1003, movies);
//    b.printSearchResults(secondMovieToFind, 1003);

  }
}