
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
