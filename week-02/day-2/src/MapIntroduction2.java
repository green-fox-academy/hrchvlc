import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("978-1-60309-452-8","A Letter to Jo");
        map.put("978-1-60309-459-7","Lupus");
        map.put("978-1-60309-444-3","Red Panda and Moon Bear");
        map.put("978-1-60309-461-0","The Lab");

        for (String i: map.keySet()) {
                System.out.println(map.get(i) + " (ISBN: " + i + ")");
        }
        System.out.println("-------------");

        map.remove("978-1-60309-444-3");

        map.values().remove("The Lab");

        map.put("978-1-60309-450-4","They Called Us Enemy");
        map.put("978-1-60309-453-5","Why Did We Trust Him?");

        for (String i: map.keySet()) {
            System.out.println(map.get(i) + " (ISBN: " + i + ")");
        }

        System.out.println("Contains key? " + map.containsKey("478-0-61159-424-8"));

        System.out.println(map.get("978-1-60309-453-5"));
    }
}
//}
//
//// https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/data-structures/map-introduction-2/README.md