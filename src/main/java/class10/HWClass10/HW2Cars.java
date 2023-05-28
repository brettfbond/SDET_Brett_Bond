package class10.HWClass10;

public class HW2Cars {
    public static void main(String[] args) {

        String[][] cars = {
                {"Ford", "Chevy", "Buick"},
                {"BMW", "Mercedes", "VW"},
                {"Hyundai", "Kia"},
                {"Alfa Romeo", "Ferrari", "Fiat", "Lamborghini"}
        };

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }

        for (String[] car : cars) {
            for (String s : car) {
                System.out.println(s);
            }

        }
    }
}
