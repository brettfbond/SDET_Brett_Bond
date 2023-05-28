package class10.GroupProject;

public class T01Temps {
    public static void main(String[] args) {

        int[] temp = {72,68,69,78,45,56,74};
        int highest = temp[0];
        int lowest = temp[0];

        for (int i : temp) {
            if (i > highest) {
                highest = i;
            }
            if (i < lowest) {
                lowest = i;
            }
        }
        System.out.println("The highest temperature this week was " + highest + " and the lowest was " + lowest);
    }
}
