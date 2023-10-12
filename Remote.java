public class Remote {
    
    public class TV {
       
        private int channel;
        private int volume;
        private boolean powerOn;
        private String brand;
        private String model;


        private static int numTVs;
        private static String remoteBrand;
        private static String remoteModel;

        public TV(int channel, int volume, boolean powerOn, String brand, String model) {
            this.channel = channel;
            this.volume = volume;
            this.powerOn = powerOn;
            this.brand = brand;
            this.model = model;
        }

        // Non-static methods
        public void changeChannel(int newChannel) {
            this.channel = newChannel;
            System.out.println("Channel changed to " + newChannel);
        }

        public void adjustVolume(int newVolume) {
            this.volume = newVolume;
            System.out.println("Volume adjusted to " + newVolume);
        }

        // Static methods
        public static void displayNumTVs() {
            System.out.println("Number of TVs: " + numTVs);
        }

        public static void displayRemoteInfo() {
            System.out.println("Remote Brand: " + remoteBrand);
            System.out.println("Remote Model: " + remoteModel);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the TV class
        TV myTV = new Remote().new TV(1, 50, true, "Sony", "X900H");

        // Accessing non-static methods and variables
        myTV.changeChannel(5);
        myTV.adjustVolume(60);

        // Accessing static methods and variables
        TV.displayNumTVs();
        TV.displayRemoteInfo();
    }
}
