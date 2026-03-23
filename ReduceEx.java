import java.util.Arrays;
import java.util.List;

public class ReduceEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34, 12, 45, 76, 34, 56, 54, 32);
        int sum = list.stream().reduce(1, (a, b) -> a + b);
        System.out.println("Sum = " + sum);
        double avg = list.stream().reduce(0, (a, b) -> a + b) / list.size();
        System.out.println("Avg = " + avg);
        int count = list.stream().reduce(0, (a, b) -> a + 1);
        System.out.println("Count = " + count);

    }
}
