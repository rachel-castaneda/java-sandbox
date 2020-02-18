import java.lang.reflect.Array;
import java.util.ArrayList;

public class AssessmentPractice {

    public static void main (String [] args) {

        System.out.println(square(5));
        System.out.println(sum(5,5));
        System.out.println(sum(2.5,2.5));
        int [] numbers = new int[] {1,2};
        System.out.println(average(numbers));

        ArrayList <User> userList = new ArrayList<>();

        User user = new User ("jacob", "black", true);
        User user1 = new User ("edward", "cullen", false);
        User user2 = new User ("bella", "swan", true);
        User user3 = new User ("ron", "swanson", false);

        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        System.out.println(capitalizeRecords(userList));
        for (int i=0; i<userList.size(); i++) {
            System.out.println(capitalizeRecords(userList).get(i).getFirstName()+" "+capitalizeRecords(userList).get(i).getLastName());
        }

    }

    public static long square(int number) {
        return number*number;
    }

    public static long sum (int a, int b) {
        return a + b;
    }

    public static double sum (double a, double b) {
        return a + b;
    }

    public static double average (int[] arr) {
        double sum = 0;
        for (int value : arr) {
            sum = sum + value;
        }
        return sum/arr.length;
    }

    public static ArrayList<User>capitalizeRecords(ArrayList<User> list) {
        ArrayList<User> capUsers = new ArrayList<>();
        ArrayList<String> strUsers = new ArrayList<>();

        for (int i =0; i<list.size(); i++) {
            char [] firstName = list.get(i).getFirstName().toCharArray();
            char [] lastName = list.get(i).getLastName().toCharArray();

            if (Character.isLowerCase(firstName[0])) {
                firstName[0] = Character.toUpperCase(firstName[0]);
            }
            if (Character.isLowerCase(lastName[0])) {
                lastName[0] = Character.toUpperCase(lastName[0]);
            }

            String strFirst = new String (firstName);
            String strLast = new String (lastName);

            User user = new User (strFirst, strLast, list.get(i).admin);
            capUsers.add(user);
        }

        for (int i = 0; i<capUsers.size(); i++) {
            strUsers.add(capUsers.get(i).getFirstName() + " " + capUsers.get(i).getLastName());
        }
        return capUsers;
    }


}
