import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistent.txt"); // Checked Exception
        } catch (FileNotFoundException e) {
            System.out.println("File not found! " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
