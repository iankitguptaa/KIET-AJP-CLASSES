import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        list.stream()
                .filter(x -> x > 20)
                .forEach(System.out::println);
        ;
    }
}
