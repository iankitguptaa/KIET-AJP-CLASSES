interface Add {
    int sum(int a, int b);
}

public class LambdaFnc {
    public static void main(String[] args) {
        Add x = (a, b) -> a + b;
        System.out.println(x.sum(3, 5));
    }
}
