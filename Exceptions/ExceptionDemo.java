public class ExceptionDemo {
    public static void main(String[] args) {
        
        // Example 1: ArithmeticException
        try {
            int a = 5;
            int b = 0;
            int result = a / b; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Cannot divide by zero!");
        }

        // Example 2: ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of range!");
        }

        System.out.println("Program continues after handling exceptions...");
    }
}
