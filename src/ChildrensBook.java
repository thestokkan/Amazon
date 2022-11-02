public class ChildrensBook extends Book {
  private String recommendedAge;

  public ChildrensBook(long productId, int price, String title, String author,
                       String recommendedAge) {
    super(productId, price, title, author);
    this.recommendedAge = recommendedAge;
  }

  public String getRecommendedAge() {
    return recommendedAge;
  }

  public void setRecommendedAge(String recommendedAge) {
    this.recommendedAge = recommendedAge;
  }
}