package class10.HWClass10;

public class HW3GroceryList {
    public static void main(String[] args) {

        String[][] groceries = {
                {"carrots", "broccoli", "green beans"},
                {"apples", "bananas", "kiwi"},
                {"milk", "cheese"},
                {"candy bars", "cookies", "cake", "brownies"}
        };

        for (int i = 0; i < groceries.length; i++) {
            for (int j = 0; j < groceries[i].length; j++) {
                System.out.println(groceries[i][j]);
            }
        }

        for (String[] str : groceries) {
            for (String s : str) {
                System.out.println(s);
            }

        }
    }
}
