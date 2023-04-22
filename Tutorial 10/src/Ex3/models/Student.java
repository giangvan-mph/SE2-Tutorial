package Ex3.models;

public class Student extends Human {
    private String facultyNumber;
    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }



    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) throws IllegalArgumentException{
        if(facultyNumber.length() >= 5 && facultyNumber.length() <= 10) {
            this.facultyNumber = facultyNumber;
        } else throw new IllegalArgumentException("Invalid faculty number!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(this.getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(this.getLastName())
                .append(System.lineSeparator())
                .append("Faculty Number: ").append(this.getFacultyNumber());
        return sb.toString();
    }
}
