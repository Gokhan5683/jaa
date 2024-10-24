import java.util.Scanner;

class ZeroException extends Exception {
    public ZeroException(String message) {
        super(message);
    }
}

class Prime {
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            if (number == 0) {
                throw new ZeroException("Number is 0");
            }
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } catch (ZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
