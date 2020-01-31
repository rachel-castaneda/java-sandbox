import java.util.*;
public class ProgrammingPushUps {
    public static void main (String[]args){
        System.out.println(multiply(2,5));
        System.out.println(toThePower(2,3));
    }
    public static int multiply (int a, int b) {
        int sum = 0;
        for (int i =0; i<b; i++) {
            sum +=a;
        }
        return sum;
    }
    public static int toThePower (int a, int b) {
        int product =1;
        for (int i=0; i<b; i++){
            product *= a;
        }
        return product;
    }
}
