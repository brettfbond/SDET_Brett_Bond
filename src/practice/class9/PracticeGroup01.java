package practice.class9;

public class PracticeGroup01 {
    public static void main(String[] args) {
        int[] temp = {1, 0, 15, 3, 4, 25, 45};
        int highestTemp = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > highestTemp)
            {
                highestTemp = temp[i];
            }
        }
        System.out.println(highestTemp);
        int lowestTemp = 100;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < lowestTemp)
            {
                lowestTemp = temp[i];
            }
        }
        System.out.println(lowestTemp);
    }
}

