package class22;

public interface ArrayUtil {
    public boolean searchArray(int[] arr, int num);
}
class Main implements ArrayUtil {

    @Override
    public boolean searchArray(int[] arr, int num) {
        boolean numCheck = false;
        for (int j : arr) {
            if (j == num) {
                numCheck = true;
                break;
            }
        }
        return numCheck;
    }
}
