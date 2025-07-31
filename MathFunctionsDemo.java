public class MathFunctionsDemo {

    // Returns absolute value of a number
    public static int absoluteValue(int x) {
        return Math.abs(x);
    }

    // Returns the maximum of two numbers
    public static int maximum(int a, int b) {
        return Math.max(a, b);
    }

    // Returns the minimum of two numbers
    public static int minimum(int a, int b) {
        return Math.min(a, b);
    }

    // Returns the square root of a number
    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    // Returns a raised to the power of b
    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    // Rounds a floating point number to the nearest integer
    public static long roundValue(double x) {
        return Math.round(x);
    }

    // Generates a random integer between min (inclusive) and max (inclusive)
    public static int randomInt(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    public static void main(String[] args) {
        System.out.println("Absolute value of -10: " + absoluteValue(-10));
        System.out.println("Maximum of 12 and 25: " + maximum(12, 25));
        System.out.println("Minimum of 12 and 25: " + minimum(12, 25));
        System.out.println("Square root of 81: " + squareRoot(81));
        System.out.println("2 raised to the power 5: " + power(2, 5));
        System.out.println("Round 4.7: " + roundValue(4.7));
        System.out.println("Random integer between 1 and 100: " + randomInt(1, 100));
    }
}
