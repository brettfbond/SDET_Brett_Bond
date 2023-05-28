package class14.HWclass14;

public class HW02Email {

    // Create a method createEmail(). Based on values of users firstName, lastName and email type,
    // your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    String createEmail(String firstName, String lastName, String emailDomain) {
        String email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + emailDomain.toLowerCase() + ".com";
        return email;
    }

    public static void main(String[] args) {

        HW02Email obj = new HW02Email();
        System.out.println(obj.createEmail("BrettF", "Bond", "Gmail"));
    }
}
