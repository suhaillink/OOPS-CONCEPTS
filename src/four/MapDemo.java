package four;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(0,"a");
        map.put(1,"b");
        map.put(2,"c");

        System.out.println(map);

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
