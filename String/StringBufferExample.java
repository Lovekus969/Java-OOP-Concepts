public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("BMW");
        sb.append(" M5CS");  // modifies original object
        System.out.println(sb); // BMW M5CS
    }
}
