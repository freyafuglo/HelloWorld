public class Person {
    private String firstName = "Mit fornavn";
    private String lastName = "Mit efternavn";

    public Person(){

    }

    public Person(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public String getFirstName() {
        return firstName;

    }

    public void setLastName(String eName) {
        lastName = eName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "Hej " + firstName + " " + lastName;
    }
}

