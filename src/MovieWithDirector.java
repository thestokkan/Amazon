public class MovieWithDirector extends Movie {
  private String director;

  public MovieWithDirector(long productId, int price, String type, String title,
                           MovieGenre genre, String director) throws Exception {
    super(productId, price, type, title, genre);
    this.director = director;
  }

  @Override
  public void printDetails() {
    super.printDetails();
    System.out.println("Director: " + director);
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }
}