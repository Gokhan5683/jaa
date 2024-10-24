// File: Main.java
import s20q2.Addition;
import s20q2.Maximum;

class Main {
    public static void main(String[] args) {
        // Using Addition class
        Addition addObj = new Addition();
        System.out.println("Sum: " + addObj.add(10, 20));
        System.out.println("Difference: " + addObj.subtract(7.5f, 3.2f));

        // Using Maximum class
        Maximum maxObj = new Maximum();
        System.out.println("Maximum: " + maxObj.max(25, 18));
    }
}
