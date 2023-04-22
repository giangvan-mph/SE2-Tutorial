package Ex1;

public class Child extends Person {

    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    protected void setAge(int age) throws IllegalArgumentException {
        super.setAge(age);
        if(age > 15) {
            throw new IllegalArgumentException(" Child's age must\n" +
                    "be lesser than 15!");
        }
    }

    @Override
    protected void setName(String name) throws IllegalArgumentException{
        super.setName(name);
        if(name.length() < 3) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
    }
}
