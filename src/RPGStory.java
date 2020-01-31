import java.util.*;

public class RPGStory {
    public static void main(String[] args) {
        String charName;
        start();
        mission1Details();
    }

    //intro//
    public static void start () {
        System.out.println("enter your name agent: ");
        Scanner scanner = new Scanner(System.in);
        String charName = scanner.next();
        System.out.println("hello agent "+charName + " unfortunately since you went AWOL a month ago, " +
                "\nthe CIA has been chasing you down. While on the run you have been accused on serious charges of treason. " +
                "\nNow is your chance to clear your name and make it back home. \ngood luck agent "+charName);
        System.out.println("would you like to start a mission? [yes/no] ");
        String newGame = scanner.next();
        while (newGame.equalsIgnoreCase("no"))
            return;
    }
    public static void mission1Details () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("location: berlin, germany 2009\n" +
                "mission: make it through the city to train station without getting caught by CIA operatives\n" +
                "destination: head to france to meet a connection\n" +
                "health: 100\n" +
                "attacks: gun, pocket knife, car keys, hand combat");
        System.out.println("\nagent, do you understand your objective? [yes/no] ");
        String continueTo = scanner.next();
        while (continueTo.equalsIgnoreCase("no")) return;
    }
}
