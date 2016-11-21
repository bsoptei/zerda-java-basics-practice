package gardenapp;

/**
 * Created by Söp on 2016.11.21., for Java test exam
 */
abstract class Plant {
    int waterLevel;
    String color;
    public abstract void waterPlant(double liters);
    double comfortWaterLevel;
    String name;

    public String toString() {
        return String.format("The %s %s %s water\n", color, name, checkStatus());
    }

    private String checkStatus() {
        if (waterLevel < comfortWaterLevel) {
            return "needs";
        } else {
            return "doesn't need";
        }
    }
}
