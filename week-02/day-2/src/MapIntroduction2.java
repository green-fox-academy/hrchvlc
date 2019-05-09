import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("978-1-60309-452-8","A Letter to Jo");
        map.put("978-1-60309-459-7","Lupus");
        map.put("978-1-60309-444-3","Red Panda and Moon Bear");
        map.put("978-1-60309-461-0","The Lab");

        for (String i: map.keySet()) {
            for (String j : map.values()) {
                System.out.println(map.get(i) + " (ISBN: " + map.get(j) + ")");
            }
        }
    }
}
//}
//
//// https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/data-structures/map-introduction-2/README.md