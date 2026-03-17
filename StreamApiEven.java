import java.util.*;

public class StreamApiEven {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 15, 20, 25, 30, 11, 17, 16);
        data.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
