package class25;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class E09Maps {
    public static void main(String[] args) {

        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipstick", 100.0);
        makeup.put("Blush", 68.0);
        makeup.put("Eye liner", 80.0);
        makeup.put("Foundation", 120.0);
        makeup.put("Base", 120.0);

        Set<String> keys = makeup.keySet();
        System.out.println(keys);
        Collection<Double> values = makeup.values();
        System.out.println(values);
        values.removeIf(v -> v > 80.0);
        System.out.println(values);

        XSSFWorkbook xssfWorkbook;

    }
}
