package Ex2;

public class GoldenEditionBook extends Book{
    public GoldenEditionBook(String title, String author, double price) {
        super(title, price, author);
    }

    @Override
    protected void setPrice(double price) {
        super.setPrice(price + price * 0.3);

    }
}
