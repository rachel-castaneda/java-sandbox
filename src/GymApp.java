import java.lang.reflect.Member;
import java.util.Arrays;

public class GymApp {

    private Membership[] memberships;
    private static int totalMembers = 3;

    public GymApp (Membership[] memberships) {
        this.memberships = memberships;
    }

    public static int getTotalMembers () {
        return totalMembers;
    }

    public static void main (String [] args) {
        // initial persons
        Person hung = new Person("hung", "ly", 180, 1, new String[]{"lose 10lbs", "get stronger"});
        Person charlie = new Person("charlie", "delgado", 130, 2, new String[]{"gain 10lbs", "get stronger"});
        Person paris = new Person("paris", "tyus", 260, 3, new String[]{"lose 10lbs", "get buff"});

        // initial memberships
        Membership member1 = new Membership(hung, "elite", 40.00, "monthly", true);
        Membership member2 = new Membership(charlie, "basic", 20.00, "monthly", false);
        Membership member3 = new Membership(paris, "gold", 30.00, "monthly", true);

        Membership[] currentMembers = new Membership[]{member1, member2, member3};

//        for (Membership member : currentMembers) {
//            System.out.println(member.getPerson().firstName);
//        }
//        printPersonInfo(hung);

        GymApp app = new GymApp(currentMembers);

        System.out.println("total members: " + GymApp.getTotalMembers());
        app.addMember(app.memberships, new Membership(
                new Person("rachel", "castaneda", 110, 4, new String[]{"gain muscle", "do 2 push-ups"}), "elite", 400.00, "annual", true)
        );
        System.out.println("total members: " + GymApp.getTotalMembers());
//        app.getTotalMembers();
//        app.memberships[1];

    }

    // create an array of memberships
    // add a member, add membership to array, increase total members
    public static Membership[] addMember(Membership[] oldMembershipArray, Membership newMembership) {
        Membership[] returnArray;
        returnArray = Arrays.copyOf(oldMembershipArray, oldMembershipArray.length+1);
        returnArray[returnArray.length-1] = newMembership;
        GymApp.totalMembers++;

        return returnArray;
    }

    // delete a member

    // print person info
    public static void printPersonInfo (Person personObj) {
            System.out.printf("person's information below: \n");
            System.out.printf("first name: %s \n" +
                    "last Name: %s \n" +
                    "weight: %d \n" +
                    "member ID: %d \n" ,
                    personObj.firstName, personObj.lastName, personObj.getWeight(), personObj.getMemberID() );
            for (String goals : personObj.getGoals()) {
                System.out.printf("%s ", goals);
            }
            System.out.println("\n");
    }

    // edit info
}
