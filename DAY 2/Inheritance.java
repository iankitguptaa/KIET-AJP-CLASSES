class A {
    A() {
        System.out.println("A Class");
    }
}

class B extends A {
    B() {
        System.out.println("B class");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1);
    }
}
