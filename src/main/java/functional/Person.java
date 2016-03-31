package functional;

/** This class manages a person object. It allows you to manage and retrieve
 * the data needed to be stored about a person
 */

public class Person implements Comparable<Person>{
//public class Person {

    private int    personId;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phoneNum;
    private String faxNum;

    /** This method is the default constructor for the person class
     *  @param it takes in no data
     *  @return it returns no data*/
    public Person() {
        this.personId = 0;
        this.firstName = "";
        this.lastName = "";
        this.birthDate = "";
        this.phoneNum = "";
        this.faxNum = "";


    }
    /** This method is the constructor for the person class
     *  @param personId it receives a person id
     *  @param firstName it receives a first name
     *  @param lastName it receives a last name
     *  @param birthDate it receives a birth date
     *  @return it returns no data*/
    public Person(int personId, String fname, String lname, String bdate, String phoneNum, String faxNum) {
        this.personId = personId;
        this.firstName = fname;
        this.lastName = lname;
        this.birthDate = bdate;
        this.phoneNum = phoneNum;
        this.faxNum = faxNum;
    }
    /** This method returns the person's id number
     *  @param it receives no input
     *  @return personId it returns the person's id number*/
    public int getPersonId() {
        return personId;
    }
    /** This method sets the person's id number
     *  @param personId it receives a person id
     *  @return void it returns no data*/
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    /** This method returns the person's First name
     *  @param it receives no input
     *  @return firstName it returns the person's first name*/
    public String getFirstName() {
        return firstName;
    }
    /** This method sets the person's first name
     *  @param firstName it receives a first name
     *  @return void it returns no data*/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /** This method returns the person's last name
     *  @param it receives no input
     *  @return lastName it returns the person's last name*/
    public String getLastName() {
        return lastName;
    }
    /** This method sets the person's last name
     *  @param lastName it receives a last name
     *  @return void it returns no data*/
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /** This method returns the person's birth date
     *  @param it receives no input
     *  @return birthDate it returns the person's birth date*/
    public String getBirthDate() {
        return birthDate;
    }
    /** This method sets the person's birth date
     *  @param birthDate it receives a birth date
     *  @return void it returns no data*/
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    /** This method returns the perosn's phone number
     *  @param it receives no input
     *  @return phoneNum it returns the person's phone number*/
    public String getPhoneNum() {
        return phoneNum;
    }
    /** This method updates the person's phone number
     *  @param it receives a phone number
     *  @return void  it returns no data*/
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    /** This method returns the person's fax number
     *  @param it receives no input
     *  @return phoneNum it returns the person's fax number*/
    public String getFaxNum() {
        return faxNum;
    }
    /** This method sets the person's fax number
     *  @param faxNumb it receives a fax number
     *  @return void it returns no data*/
    public void setFaxNum(String faxNum) {
        this.faxNum = faxNum;
    }
    /** This method returns a String display of the person's instance variables.
     *  @param it receives no input
     *  @return personData it returns a string of data*/
    public String toString() {
        return ("Id: " + getPersonId() + " Name: " + getFirstName() + " " + getLastName() + " " + " Birthdate: " + birthDate +
                " " + " Phone Number: " + " " + getPhoneNum());
    }
    /** This method compares ther passed Person object with the called.
     *  @param a person object
     *  @returns 0, if the the two are equal
     *   returns -1, if the passed is greater
     *   returns 1, if the passed is less*/
    public int compareTo(Person person) {


        if (this == person)
            return 0;

        if (this.personId == person.personId)
            return 0;
        else if (this.personId > person.personId)
            return 1;
        else
            return -1;

    }

    /** This method checks if this objct equlas another one.
     *  @param a person object
     *  @returns 0, if the the two are equal
     *   returns -1, if the passed is greater
     *   returns 1, if the passed is less*/
    public boolean equals(Object other) {

        if (this == other)
            return true;

        if (other == null)
            return false;

        if (getClass() != other.getClass())
            return false;

        Person tempPerson = (Person) other;

        if (this.personId == tempPerson.personId
                && this.firstName.equals(tempPerson.getFirstName())
                && this.lastName.equals(tempPerson.getLastName())
                && this.phoneNum.equals(tempPerson.getPhoneNum())
                && this.faxNum.equals(tempPerson.getFaxNum()) )

            return true;
        else

            return false;

    }
}
