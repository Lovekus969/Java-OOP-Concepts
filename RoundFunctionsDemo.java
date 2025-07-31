public class RoundFunctionsDemo {
    public static void main(String[] args) {
        double[] numbers = {4.3, 4.5, 4.7, -4.3, -4.5, -4.7};

        System.out.println("Demonstrating ceil, floor, rint, and round:\n");

        for (double num : numbers) {
            System.out.println("Number: " + num);
            System.out.println(" Math.ceil(" + num + ") = " + Math.ceil(num));
            System.out.println(" Math.floor(" + num + ") = " + Math.floor(num));
            System.out.println(" Math.rint(" + num + ") = " + Math.rint(num));
            System.out.println(" Math.round(" + num + ") = " + Math.round(num));
            System.out.println();
        }
    }
}
