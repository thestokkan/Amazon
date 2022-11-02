public class Product {
  protected long productId;
  protected int price;
  protected String type;

  public Product(long productId, int price, String type) {
    this.productId = productId;
    this.price = price;
    this.type = type;
  }

  public void printDetails() {
    System.out.println("ID: " + productId);
    System.out.println("Type: " + type);
    System.out.println("Price: " + price);
  }

  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}