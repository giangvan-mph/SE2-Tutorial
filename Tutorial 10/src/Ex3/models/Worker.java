package Ex3.models;

public class Worker extends Human{
    private double weekSalary;
    private double workingHours;
    private double salaryPerHour;
    public Worker(String firstName, String lastName, double weekSalary, double workingHours) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkingHours(workingHours);

    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        if(weekSalary > 10) {
            this.weekSalary = weekSalary;
        } else throw new IllegalArgumentException("Expected value mismatch!Argument:\n" +
                "weekSalary");
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        if(workingHours >= 1 && workingHours <= 12) {
            this.workingHours = workingHours;
        } else throw new IllegalArgumentException("Expected value mismatch!Argument:\n" +
                "workHoursPerDay");
    }

    public double getSalaryPerHour() {
        return (weekSalary / 7) / workingHours;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(this.getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(this.getLastName())
                .append(System.lineSeparator())
                .append("Week Salary: ").append(this.getWeekSalary())
                .append(System.lineSeparator())
                .append("Hours per day: ").append(this.getWorkingHours())
                .append(System.lineSeparator())
                .append("Salary per hour: ").append(this.getSalaryPerHour())
                .append(System.lineSeparator());
        return sb.toString();
    }

}
