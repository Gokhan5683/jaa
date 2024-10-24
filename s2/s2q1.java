class BMICalculator {
    public static void main(String[] args) {
        String firstName = args[0];
        String lastName = args[1];
        double weight = Double.parseDouble(args[2]);
        double height = Double.parseDouble(args[3]);
        double bmi = weight / (height * height);
        System.out.printf("%s %s: BMI = %.2f%n", firstName, lastName, bmi);
    }
}
