package ca.nl.cna.java1.objects;

/**
 * A simple class for a Person. This is a base class to be used in a hierarchy for clients or employees.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;   //TODO use a Date object

    /**
     * Constructor that takes in all attributes. Not constraints enforced.
     * @param firstName first name
     * @param lastName last name
     * @param birthYear Year of birth
     */
    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    /**
     * Get first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set first name
     * @param firstName first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set last name
     * @param lastName last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get birth year
     * @return birth year
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Set birth year
     * @param birthYear birth year
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

}
