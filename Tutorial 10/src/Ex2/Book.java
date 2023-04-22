package Ex2;

public class Book {
    private String title;
    private String author;
    private double price;


    public Book(String title, double price, String author) {
        this.setTitle(title) ;
        this.setPrice(price);
        this.setAuthor(author);
    }

    public String getTitle() {
        return title;
    }

    protected void setTitle(String title) throws IllegalArgumentException {
        if(title.length() < 3 ) {
            throw new IllegalArgumentException ("Title is not valid!");
        } else {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    protected void setAuthor(String author) throws IllegalArgumentException{

        for (int i = 0; i < author.length(); i++) {
            char c = author.charAt(i);

            char blank = ' ';
            if(Character.valueOf(c).equals(blank)) {
                char nextC = author.charAt(i+1);
                if(Character.isDigit(nextC)) throw new IllegalArgumentException("Invalid author");
            }
        }
        this.author = author;




    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        if(price < 1) {
            throw new IllegalArgumentException("Price is not valid");

        } else {
            this.price = price;
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
