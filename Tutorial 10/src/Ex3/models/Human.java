package Ex3.models;

public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws  IllegalArgumentException{
        char start = firstName.charAt(0);
        if(Character.isUpperCase(start) && firstName.length() > 4) {
            this.firstName = firstName;
        } else if(!Character.isUpperCase(start)) {
            throw new IllegalArgumentException("Expected upper case letter! Argument:\n" +
                    "firstName");
        } else {
            throw new IllegalArgumentException("Expected length at least 4\n" +
                    "symbols!Argument: firstName");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        char start = lastName.charAt(0);
        if(Character.isUpperCase(start) && lastName.length() > 3) {
            this.lastName = lastName;
        } else if(!Character.isUpperCase(start)) {
            throw new IllegalArgumentException("Expected upper case letter! Argument:\n" +
                    "lastName");
        } else {
            throw new IllegalArgumentException("Expected length at least 3\n" +
                    "symbols!Argument: lastName");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator())
                .append("First Name: ").append(this.getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(this.getLastName())
                .append(System.lineSeparator());

        return sb.toString();
    }

}
