interface Calc {
    void calculate(int n1, int n2);

    default void calculate(int n1, int n2, int n3) {
        int s = n1 + n2 + n3;
        System.out.println("Sum = " + s);
    }
}

class Sum implements Calc {
    @Override
    public void calculate(int n1, int n2) {
        int s = n1 + n2;
        System.out.println("Sum = " + s);
    }
}

public class MainInterface {
    public static void main(String[] args) {
        Sum c = new Sum();
        c.calculate(10, 20);
        c.calculate(10, 20, 30);
    }
}
