import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("William A. Lathan", "405-709-1865");
        map.put("John K. Miller", "402-247-8568");
        map.put("Hortensia E. Foster", "606-481-6467");
        map.put("Amanda D. Newland", "319-243-5613");
        map.put("Brooke P. Askew", "307-687-2982");

        System.out.println(map.get("John K. Miller"));

        for (Map.Entry<String, String> item: map.entrySet()) {
            if (item.getValue() == "307-687-2982") {
                System.out.println(item.getKey());
            }
        }
        System.out.println(map.get("Chris E. Myers") + " means that he is not there.");
    }
}
// https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/data-structures/telephone-book/README.md