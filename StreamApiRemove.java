import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApiRemove {
    public static void main(String[] args) {

        List<String> data = Arrays.asList("java", null, "Spring", null, "React");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(data);
        data.stream().filter(str -> str != null).forEach(System.out::println);
    }
}