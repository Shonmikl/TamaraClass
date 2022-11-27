package tamara.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(123, "Q");
        map.put(124, "Q1");
        map.put(125, "Q2");
        map.put(126, "Q3");
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(52);
        list.add(53);
        list.add(54);
        list.add(55);

//        for (Integer name : list) {
//            System.out.println(name);
//        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }



    }
}
