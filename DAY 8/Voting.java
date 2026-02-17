@FunctionalInterface
interface Vote {
    void checkAge(int age);
}

public class Voting {
    public static void main(String[] args) {
        Vote v = age -> {
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote.");
            }
        };
        v.checkAge(20); // change age here
    }
}
