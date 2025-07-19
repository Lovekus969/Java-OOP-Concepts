// Simulates the 12-speaker sound system in a BMW M8 using OOP principles

class Speaker {
    String location;
    String type;
    int wattage;

    // Constructor to initialize each speaker
    public Speaker(String location, String type, int wattage) {
        this.location = location;
        this.type = type;
        this.wattage = wattage;
    }

    // Simulate playing sound through this speaker
    void playSound(String audioTrack) {
        System.out.println("🔊 " + location + " " + type + " speaker playing: \"" + audioTrack + "\" at " + wattage + "W");
    }
}

class SoundSystem {
    Speaker[] speakers;

    // Constructor to initialize the full 12-speaker setup
    public SoundSystem() {
        speakers = new Speaker[] {
            new Speaker("Dashboard", "Midrange", 40),
            new Speaker("Front Left Door", "Tweeter", 20),
            new Speaker("Front Left Door", "Midrange", 30),
            new Speaker("Front Right Door", "Tweeter", 20),
            new Speaker("Front Right Door", "Midrange", 30),
            new Speaker("Rear Left Door", "Tweeter", 20),
            new Speaker("Rear Left Door", "Midrange", 30),
            new Speaker("Rear Right Door", "Tweeter", 20),
            new Speaker("Rear Right Door", "Midrange", 30),
            new Speaker("Rear Deck", "Full-Range", 50),
            new Speaker("Underseat Left", "Subwoofer", 100),
            new Speaker("Underseat Right", "Subwoofer", 100)
        };
    }

    // Function to simulate playing music on all speakers
    void play(String trackName) {
        System.out.println("🎶 Now playing: \"" + trackName + "\" on BMW M8 Sound System");
        for (Speaker s : speakers) {
            s.playSound(trackName);
        }
    }

    // Function to simulate surround mode (only midrange and subwoofers play)
    void playSurroundMode(String trackName) {
        System.out.println("🎧 Surround Mode Activated for: \"" + trackName + "\"");
        for (Speaker s : speakers) {
            if (s.type.equals("Midrange") || s.type.equals("Subwoofer")) {
                s.playSound(trackName);
            }
        }
    }

    // Function to simulate muting the system
    void muteAll() {
        System.out.println("🔇 System Muted. All speakers are silent.");
    }
}

public class BMWM8SoundSystem {
    public static void main(String[] args) {
        // 1️⃣ Step 1: Create a new sound system object (like turning on the car audio)
        SoundSystem m8System = new SoundSystem();

        // 2️⃣ Step 2: Play a full-range track on all 12 speakers
        m8System.play("🔥 Big Bass Track - Engine Roar Remix 🔥");

        // 3️⃣ Step 3: Activate surround mode for cinematic sound
        m8System.playSurroundMode("🎬 Fast & Furious Intro Theme");

        // 4️⃣ Step 4: Mute the system (simulate stopping the audio)
        m8System.muteAll();
    }
}
