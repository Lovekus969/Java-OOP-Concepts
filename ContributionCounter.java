public class ContributionCounter {
    
    // Method to print contribution messages for each day until count
    public static void celebrateContributions(int totalContributions) {
        for (int day = 1; day <= totalContributions; day++) {
            System.out.println("Day " + day + ": Contribution completed! 🎉");
        }
        System.out.println("Congrats! You have completed " + totalContributions + " contributions!");
    }

    public static void main(String[] args) {
        int contributions = 727;
        celebrateContributions(contributions);
    }
}
