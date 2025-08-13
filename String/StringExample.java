public class StringExample {
    public static void main(String[] args) {
        String s1 = "BMW"; // stored in String Pool
        String s2 = s1;    // points to same object in pool

        s1 = s1 + " M4CS"; // creates a new String object
        System.out.println(s1); // BMW M4CS
        System.out.println(s2); // BMW
    }
}
