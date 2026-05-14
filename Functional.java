@FunctionalInterface
interface hello {
    void show();
}

public class Functional {
    public static void main(String[] args) {
        hello h = () -> System.err.println("hello World");
        h.show();
    }
}
