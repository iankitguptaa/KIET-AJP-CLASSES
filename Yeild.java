public class Yeild {
    public static void main(String[] args) {
        int day = 2;
        String result = switch (day) {
            case 1:
                yield "one";
            case 2:
                yield "two";
            case 3:
                yield "three";
            default:
                yield "other";
        };
        System.out.println(result);
    }
}
