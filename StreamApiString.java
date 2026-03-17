import java.util.*;

public class StreamApiString {
    public static void main(String[] args) {

        List<String> data = Arrays.asList("Amit", "Ravi", "Anil", "Vikas", "Ashok", "Rahul");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(data);
        data.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
    }
}