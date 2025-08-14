public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int result = 10 / 0;  // ArithmeticException
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues after multiple catch blocks.");
    }
}
