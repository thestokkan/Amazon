public class ChildrensBook extends Book {
  private String recommendedFromAge;

  public ChildrensBook(long productId, int price, String type, String title,
                       String author, String recommendedFromAge) {
    super(productId, price, type, title, author);
    this.recommendedFromAge = recommendedFromAge;
  }

  @Override
  public void printDetails() {
    super.printDetails();
    System.out.println("Recommended from: " + recommendedFromAge);
  }

  public String getRecommendedFromAge() {
    return recommendedFromAge;
  }

  public void setRecommendedFromAge(String recommendedFromAge) {
    this.recommendedFromAge = recommendedFromAge;
  }
}