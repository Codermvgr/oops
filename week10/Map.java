import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> x = new HashMap<>();
        x.put("prasad", 8);
        x.put("dinesh", 5);
        x.put("ganesh", 7);

        System.out.println(x.keySet());
        System.out.println(x.values());
        System.out.println(x);
        for (String key : x.keySet()) {
            System.out.println(key + " : " + x.get(key));
        }
    }
}
