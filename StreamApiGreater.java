import java.util.*;

public class StreamApiGreater {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 60, 45, 90, 30, 24, 50, 76);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(data);
        data.stream().filter(n -> n >= 50 && n <= 60).forEach(System.out::println);
    }
}
