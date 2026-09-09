package four;
import java.util.ArrayList;
import java.util.List;
public class ListDemo {
    public static void main(String[] args) {
        List<String> user = new ArrayList<>();
        user.add("suhail");
        user.add("kumar");
        user.add("1");

        for(String s: user){
            System.out.println(s);
        }
    }
}
