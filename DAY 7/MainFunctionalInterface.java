// A Functional Interface in Java is an interface that contains exactly one abstract method.
@FunctionalInterface
interface Add {
    int calculate(int n1, int n2);
}

public class MainFunctionalInterface {
    public static void main(String[] args) {
        Add a1 = (int n1, int n2) -> (n1 + n2); // lamda expression
        System.out.println("Sum = " + a1.calculate(23, 34));
    }
}