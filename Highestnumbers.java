import java.util.*;

public class Highestnumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 20, 8, 28, 25);
        Integer SecondHighest = list.stream().sorted(Comparator.reverseOrder()).toList().get(1);
        System.out.println(SecondHighest);

    }
}