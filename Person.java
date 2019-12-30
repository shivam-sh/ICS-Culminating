/**
 * Person.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * Abstract class that sets base values for all people
 */
public abstract class Person {
    private String firstName;
    private String lastName;

    public Person(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }
}