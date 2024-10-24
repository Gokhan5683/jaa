class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        for (String arg : args) {
            int number = Integer.parseInt(arg);
            if (isPrime(number)) {
                System.out.print(number + " is prime");
            }
            else{
            		System.out.println(number+" is not prime");
            }
        }
    }
}
