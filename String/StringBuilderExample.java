public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("BMW");
        sb.append(" M8 Competition"); // modifies original object
        System.out.println(sb); // BMW M8 Competition
    }
}
