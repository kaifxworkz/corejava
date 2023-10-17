
public class Computer {
    // Static variables initialized in the static block
    static String staticBrandName;
    static String staticScreenSize;
    static String staticResolution;
    static String staticManufacturer;
    static String staticModel;

    static {
        staticBrandName = "ABC Company";
        staticScreenSize = "15 inches";
        staticResolution = "1920x1080";
        staticManufacturer = "XYZ Manufacturer";
        staticModel = "Model123";
    }

    // Non-static variables
    String brandName;
    String screenSize;
    String resolution;
    String manufacturer;
    String model;
    String[] additionalFeatures;
    MonitorType monitorType;

    // Enum for monitor types
    enum MonitorType {
        LED,
        LCD,
        CRT
    }

    // Constructor with constructor chaining
    public Computer(String brandName, String screenSize, String resolution, String manufacturer, String model, String[] additionalFeatures, MonitorType monitorType) {
        this.brandName = brandName;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.manufacturer = manufacturer;
        this.model = model;
        this.additionalFeatures = additionalFeatures;
        this.monitorType = monitorType;
    }

    // Constructor with constructor chaining
    public Computer(String brandName, String screenSize, String resolution, String manufacturer, String model, String[] additionalFeatures, String monitorType) {
        this(brandName, screenSize, resolution, manufacturer, model, additionalFeatures, MonitorType.valueOf(monitorType));
    }

    // Method to print all variables
    public void printAllMethod() {
        System.out.println(staticBrandName + ", " + staticScreenSize + ", " + staticResolution + ", " + staticManufacturer + ", " + staticModel);
        System.out.println(brandName + ", " + screenSize + ", " + resolution + ", " + manufacturer + ", " + model);
        System.out.println(monitorType.toString());
    }

    // Method to print array values
    public void printValuesOfArray() {
        for (String feature : additionalFeatures) {
            System.out.println(feature);
        }
    }

    // Method to get computer name
    public String getComputerName() {
        return brandName;
    }
}





// ComputerStarter.java
public class ComputerStarter {
    public static void main(String[] args) {
        // Creating 4 objects
        String[] additionalFeatures = {"Feature1", "Feature2", "Feature3", "Feature4", "Feature5"};
        Computer computer1 = new Computer("Dell", "17 inches", "2560x1440", "Dell Inc.", "Model456", additionalFeatures, "LED");
        Computer computer2 = new Computer("HP", "13 inches", "1920x1080", "HP Inc.", "Model789", additionalFeatures, "LCD");
        Computer computer3 = new Computer("Acer", "20 inches", "3840x2160", "Acer Inc.", "Model101", additionalFeatures, "CRT");
        Computer computer4 = new Computer("Lenovo", "15 inches", "1920x1080", "Lenovo Group", "Model111", additionalFeatures, "LED");

        // Accessing methods
        computer1.printAllMethod();
        computer2.printValuesOfArray();
        System.out.println(computer3.getComputerName());
        computer4.printAllMethod();
    }
}





