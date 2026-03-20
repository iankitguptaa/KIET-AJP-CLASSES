import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 32, 45, 35, 67, 89, 95);
        System.out.println(numbers);
        List<Integer> result = numbers.stream().filter(n -> n < 40).map(n -> n + 8).toList();
        System.out.println(result);
    }
}
