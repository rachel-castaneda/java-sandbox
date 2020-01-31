import java.util.Date;

public class Student {
    String name;
    String cohort;
    Date startDate;
    String program;
    String location;
    boolean drinksCoffee;

    public static void main (String [] args) {
        Student daniel = new Student("daniel");
//        daniel.name = "Daniel";
        daniel.cohort = "europa";
        daniel.startDate = new Date("06/11/2018");
        daniel.program ="web development";
        daniel.location = "san antonio";
        daniel.drinksCoffee = true;

        Student zach = new Student("zach");
//        zach.name = "zach";
        zach.cohort = "bayes";
        zach.startDate = new Date("February 11, 2017");
        zach.program = "data science";
        zach.location = "san antonio";
        zach.drinksCoffee = false;

        System.out.println(daniel.report());
        System.out.println(zach.report());
        if (zach.drinksCoffee)
            System.out.println(zach.name + " drinks coffee.");
    }
    public Student(String name){
        this.name = name;
    }
    public String report (){
        String output = "";
        output += "my name is " +this.name+ ". ";
        output += "i started learning "+this.program+" with "+this.cohort+" on "+this.startDate+". ";
        if (this.drinksCoffee)
            output += "i drink coffee in "+this.location+".";
        else
            output += "i dont drink coffee in "+this.location+".";
        return output;
    }
}
