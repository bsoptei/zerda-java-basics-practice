package gardenapp;

/**
 * Created by Söp on 2016.11.21., for Java test exam
 */
abstract class Plant {
    private double waterLevel;
    private String color;
    double comfortWaterLevel;
    private String name;
    double absorbanceCapacity;

    Plant(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String toString() {
        return String.format("The %s %s %s water\n", color, name, checkStatus());
    }

    String checkStatus() {
        if (waterLevel < comfortWaterLevel) {
            return "needs";
        } else {
            return "doesn't need";
        }
    }

    void water(double liters) {
        this.waterLevel += liters * absorbanceCapacity;
    }
}
