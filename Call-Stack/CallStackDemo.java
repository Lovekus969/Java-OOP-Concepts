public class CallStackDemo {
    static void methodA() {
        System.out.println("In methodA");
        methodB();
        System.out.println("Exiting methodA");
    }

    static void methodB() {
        System.out.println("In methodB");
        methodC();
        System.out.println("Exiting methodB");
    }

    static void methodC() {
        System.out.println("In methodC");
    }

    public static void main(String[] args) {
        System.out.println("Start main");
        methodA();
        System.out.println("End main");
    }
}
