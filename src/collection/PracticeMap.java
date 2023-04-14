package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PracticeMap {
    public static void main(String[] args) {
        HashMap<Integer, String> gujaratiMovie = new HashMap<>();
        gujaratiMovie.put(1, " Chaal Jeevi Laiye");
        gujaratiMovie.put(2, "Lakiro");
        gujaratiMovie.put(3, "vash");
        gujaratiMovie.put(4, "Amm Mangalam");
        gujaratiMovie.put(5, "Kutch Express");
        System.out.println(gujaratiMovie);
        System.out.println(gujaratiMovie.get(3));
        System.out.println(gujaratiMovie.remove(2));
        System.out.println(gujaratiMovie);
        HashSet<Integer> keys = new HashSet<>();
        ArrayList<String> values = new ArrayList<>();
        for (int i : gujaratiMovie.keySet()) {
            keys.add(i);
        }
        for (String value : gujaratiMovie.values()) {
            values.add(value);
        }
        System.out.println(keys);
        System.out.println(values);
    }
}




