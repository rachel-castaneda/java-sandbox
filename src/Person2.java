public class Person2 {
    public String firstName;
    public String lastName;
    private int weight;
    private int memberID;
    private String[] goals;

    // constructor method
    public Person2(String first, String last, int weight, int memberID, String[] goals) {
        this.firstName = first;
        this.lastName = last;
        this.weight = weight;
        this.memberID = memberID;
        this.goals = goals;
    }

    // setters
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public void setWeight (int weight) {
        this.weight = weight;
    }

    // getter
    public int getWeight () {
        return this.weight;
    }
    public int getMemberID() {
        return this.memberID;
    }
    public String[] getGoals(){
       return this.goals;
    }



}
