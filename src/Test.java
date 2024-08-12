import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String str = "1234";
        char c = str.charAt(0);
        System.out.println(c);

        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        List<String> list = map.values().stream().toList();
        Set<String> strings = map.keySet();
        System.out.println(list);
        System.out.println(strings);
    }

    interface A {
        public abstract void aa();
    }
}
