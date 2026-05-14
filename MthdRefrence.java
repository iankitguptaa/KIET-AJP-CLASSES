import java.util.Arrays;
import java.util.List;

public class MthdRefrence {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.forEach(System.out::print);
    }
}
