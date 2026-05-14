import java.util.Arrays;
import java.util.List;

public class ForEch {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.forEach(x -> System.out.println(x));
    }
}
