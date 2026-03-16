import java.util.*;
import java.util.stream.Stream;

public class FilterAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(45);
        list.addAll(List.of(23, 56, 78, 23, 45, 67));
        System.out.println(list);
        Stream listStream = list.stream();
        listStream.forEach((element) -> System.out.print(element + " "));
    }
}
