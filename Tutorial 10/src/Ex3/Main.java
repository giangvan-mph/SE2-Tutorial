package Ex3;

import Ex3.models.Student;
import Ex3.models.Worker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input student first name: ");
            String studentFirstName = scanner.nextLine();

            System.out.print("Input student last name: ");
            String studentLastName = scanner.nextLine();

            System.out.print("Input student faculty number: ");
            String facultyNumber = scanner.nextLine();

            System.out.print("Input worker first name: ");
            String workerFirstName = scanner.nextLine();

            System.out.print("Input worker last name: ");
            String workerLastName = scanner.nextLine();

            System.out.print("Input worker week salary: ");
            double workerWeekSalary = scanner.nextDouble();

            System.out.print("Input worker hours per day: ");
            double workerHours = scanner.nextDouble();

            Student student = new Student(studentFirstName, studentLastName, facultyNumber);
            Worker worker = new Worker(workerFirstName,workerLastName, workerWeekSalary, workerHours);
            System.out.println(student.toString());
            System.out.println(worker.toString());
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }
}
