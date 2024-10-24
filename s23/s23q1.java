class MyNumber {
    private int number;  // Private data member

    // Default constructor
    public MyNumber() {
        this.number = 0;
    }

    // Constructor with parameter
    public MyNumber(int number) {
        this.number = number;
    }

    // Methods to check the properties of the number
    public boolean isNegative() { return number < 0; }
    public boolean isPositive() { return number > 0; }
    public boolean isZero()     { return number == 0; }
    public boolean isOdd()      { return number % 2 != 0; }
    public boolean isEven()     { return number % 2 == 0; }

    public static void main(String[] args) {
        if (args.length > 0) {
            int value = Integer.parseInt(args[0]);  // Convert input to int
            MyNumber myNum = new MyNumber(value);   // Create object with value

            // Print the results
            System.out.println("Number: " + value);
            System.out.println("Negative? " + myNum.isNegative());
            System.out.println("Positive? " + myNum.isPositive());
            System.out.println("Zero? " + myNum.isZero());
            System.out.println("Odd? " + myNum.isOdd());
            System.out.println("Even? " + myNum.isEven());
        } else {
            System.out.println("Please provide a number.");
        }
    }
}
