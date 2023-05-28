package class9.HW;

public class HW2 {
    public static void main(String[] args) {

        // Create an array of names and store all names of your group.
        // Then print your name from that array. (use 2 different ways of creating an array).

        String[] name = {"Robin", "Brett", "Skylar", "Aubrey"};
        System.out.println(name[1]);

        String[] person = new String[4];
        person[0] = "Robin";
        person[1] = "Brett";
        person[2] = "Skylar";
        person[3] = "Aubrey";
        System.out.println(person[1]);
    }
}
