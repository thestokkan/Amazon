public class IncorrectProductIdException extends Exception {
  private long incorrectNumber;
  private String message = "Product ID cannot be negative. Product not " +
                           "created " +
                           "for ID";

  public IncorrectProductIdException(long incorrectNumber) {
    this.incorrectNumber = incorrectNumber;
  }

  @Override
  public String getMessage() {
    return message + " " + incorrectNumber;
  }
}