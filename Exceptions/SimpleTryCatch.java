public class SimpleTryCatch {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int result = 10 / 0;  // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Oops! You can't divide by zero.");
        }

        System.out.println("Program continues after handling exception...");
    }
}
