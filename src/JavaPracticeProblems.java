import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaPracticeProblems {

    public static void main (String [] args) {
//        numbersArray();
//        System.out.println("------------- next exercise -----------");
//        arrayList();
//        System.out.println("------------- next exercise -----------");
//        iterate();
//        System.out.println("------------- next exercise -----------");
//        enhanced();
//        System.out.println("------------- next exercise -----------");
//        cubed();
        newArrayList();

    }
    // making an array of numbers and getting the average of the items in the array
    public static void numbersArray() {
        int [] numbers = new int []{20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        for (int i=0; i<numbers.length; i++)
            sum = sum + numbers[i];
            int average = sum /numbers.length;
            System.out.println("the average value of the array elements is: " + average);
    }

    // after every 5 inputs add all 5 strings to an array list
    public static void newArrayList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newString = new ArrayList<>();
        System.out.println("enter a string please: ");
        String input1 = scanner.nextLine();
        System.out.println("enter a string please: ");
        String input2 = scanner.nextLine();
        System.out.println("enter a string please: ");
        String input3 = scanner.nextLine();
        newString.add(input1);
        newString.add(input2);
        newString.add(input3);
//        for (var i =0; i<=5; i++) {
//            newString.add(input);
//            if (i<5)System.out.println("enter another string please: ");
//        }
        System.out.println("here is your array list: " + newString);
    }

    // making an array list and adding elements to the array
    public static void arrayList() {
        ArrayList<String> practice = new ArrayList<>();
        practice.add("hello ");
        practice.add(" this ");
        practice.add(" is ");
        practice.add(" a ");
        practice.add(" practice ");
        practice.add(" array ");
        practice.add(" list");
        System.out.println(practice);
    }

    // iterating through all the elements of an array list
    public static void iterate() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        colors.add("purple");
        for (String element : colors) {
            System.out.println(element);
        }
    }

    // using enhanced for loops
    public static void enhanced() {
        int [] numbers = {3,7,8,5,2,4};
        int sum  = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("sum of the array = " + sum);
    }

    // using a loop and scanner to output the cube of each number upto the number input by the user
    public static void cubed() {
        int i,n;
        System.out.print("input a number: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (i = 1; i <=n; i++) {
            System.out.println("number: " + i + " | the cube of  "+ i + " is " + (i*i*i));
        }
    }

}
