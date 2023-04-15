package class10.HWClass10;

public class HW6Countries {
    public static void main(String[] args) {

        String[][] countries = {
                {"USA", "Canada", "Mexico"},
                {"Peru", "Brazil", "Chile"},
                {"France", "UK", "Spain", "Germany"},
                {"Japan", "China", "India", "Pakistan"}
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);
            }
        }

        int sum = 0;

        for (String[] str : countries) {
            for (String s : str) {
                System.out.println(s);
                sum++;
            }
        }
        System.out.println("There are " + sum + " countries in this list");
    }
}
