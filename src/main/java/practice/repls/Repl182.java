package practice.repls;

public class Repl182 {
    public static void main(String[] args) {

    }
}
class Person182 {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthday;
    private int birthYear;
    private String ssn;

    public Person182(String firstName, String lastName, int birthMonth, int birthday, int birthYear, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthday = birthday;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getSsn() {
        return ssn;
    }
    //Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format.
    // For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"
    public String formatBirthday() {
        return birthMonth + "/" + birthday + "/" + birthYear;
    }
}
