public class User extends Person {

    protected boolean admin;

    public static void main (String [] args) {
        User user = new User ("tony", "starker", true);
        User user1 = new User ("peter", "parker", false);

        System.out.println(user.isAdmin());
        System.out.println(user.isAdmin());
    }

    User (String firstName, String lastName, boolean admin) {
        super (firstName, lastName);
        this.admin = admin;
    }

    public boolean isAdmin (User this) {
        return this.admin;
    }
}
