import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();  // Full line

        System.out.print("Enter your age: ");
        int age = input.nextInt();       // Integer

        System.out.print("Enter your height: ");
        double height = input.nextDouble();  // Decimal

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        input.close();
    }
}
