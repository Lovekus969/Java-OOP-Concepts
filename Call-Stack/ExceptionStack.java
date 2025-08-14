public class ExceptionStack {
    static void methodA() { methodB(); }
    static void methodB() { methodC(); }
    static void methodC() { int x = 10 / 0; } // Exception occurs
    public static void main(String[] args) { methodA(); }
}
