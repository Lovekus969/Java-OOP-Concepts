public class NasaLaunchCountdown {
    public static void main(String[] args) {
        System.out.println("Initializing launch sequence...");

        for (int i = 10; i >= 0; i--) {
            if (i > 0) {
                System.out.println("T-minus " + i + " seconds");
            } else {
                System.out.println("Engines are running...");
                System.out.println("Lift off! 🚀");
            }

            try {
                Thread.sleep(1000); // simulate 1-second countdown
            } catch (InterruptedException e) {
                System.out.println("Countdown interrupted!");
            }
        }
    }
}
