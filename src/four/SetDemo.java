package four;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.remove("a");
        set.add("a");
        System.out.println(set);
    }
}
