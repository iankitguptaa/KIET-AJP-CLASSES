import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApiLength {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("java", "Python", "c#", "React", "C#", "Next.js", "Node.js");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(data);
        data.stream().filter(str -> str.length() > 4).forEach(System.out::println);
    }
}