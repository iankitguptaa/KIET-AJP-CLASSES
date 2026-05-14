import java.util.Arrays;
import java.util.List;

public class SortedTop3no {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList();
        System.out.println(list);
        List<Integer> sortedList = list.stream().sorted((a, b) -> a - b).toList();
        System.out.println(sortedList);
    }
}
