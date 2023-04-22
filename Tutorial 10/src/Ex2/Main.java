package Ex2;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        try {
            Scanner sc = new Scanner(System.in);

//            System.out.println("Input author: ");
            String author = sc.nextLine();
//            System.out.println("Input title: ");
            String title = sc.nextLine();

//            System.out.println("Input price: ");
            double price = sc.nextDouble();



            Book book = new Book(title, price, author);

            GoldenEditionBook goldenEditionBook = new GoldenEditionBook(title,author,price);

            Method[] bookDeclareMethod = Book.class.getDeclaredMethods();
            Method[] goldenBookDeclareMethod = GoldenEditionBook.class.getDeclaredMethods();

            if(goldenBookDeclareMethod.length > 1) {
                throw new IllegalArgumentException("Code duplication in GoldenEditionBook");

            }

            System.out.println(book.toString());
            System.out.println(goldenEditionBook.toString());
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }
}
