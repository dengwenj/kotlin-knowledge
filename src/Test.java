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

        D d = new D("ww", 19);
        System.out.println(d);

        System.out.println("D2.getA() = " + D2.getA());
        System.out.println("D2.b = " + D2.b);
        D2.test("视界");

        O.INSTANCE.test();
        System.out.println("O.a = " + O.a);
        System.out.println("O.b = " + O.b);
    }

    interface A {
        public abstract void aa();
    }

    public interface Call {
        public void loading();
    }
}
