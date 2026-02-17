@FunctionalInterface
interface Calc {
    int square(int n1);
}

public class MainFunctionalInterfacee {
    public static void main(String[] args) {
        Calc a1 = num -> num * num;
        int result = a1.square(20);
        System.out.println("Square of number is = " + result);
    }
}
