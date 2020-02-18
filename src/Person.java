public class Person implements GreeterTest {

    private String firstName;
    private String lastName;

    public static void main (String [] args) {
        Person person = new Person ("harry", "potter");
//        System.out.println(person.sayHello());
    }

    Person (String firstName, String lastName) {
        if (firstName == null) {
            throw new IllegalArgumentException("thats not a name, stop it.");
        } else if (lastName == null) {
            throw new IllegalArgumentException("choose a better last name, cause thats nothing");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String sayHello() {
        return "hello from " + firstName + " " + lastName + ".";
    }

}
