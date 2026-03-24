import java.util.Arrays;
import java.util.List;

public class SortedDesc {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45, 11, 78, 2, 90, 34);
        System.out.println(list);
        List<Integer> sortedList = list.stream().sorted((a, b) -> b - a).toList();
        System.out.println(sortedList);
    }
}
