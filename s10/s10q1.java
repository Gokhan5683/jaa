import java.util.function.Function;
class Cube {
    public static void main(String[] args) {
        Function<Integer, Integer> cube = n -> n * n * n;
        int number = 9;
        System.out.println("The cube of " + number + " is: " + cube.apply(number));
    }
}
