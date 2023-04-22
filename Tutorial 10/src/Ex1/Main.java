package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        try {
            Child child = new Child(name, age);
            System.out.println(child.toString());
            String personNameClassName = Person.class.getName();
            String childClassName = Child.class.getName();

        }catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }
}