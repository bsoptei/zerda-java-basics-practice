package gardenapp;

/**
 * Created by Söp on 2016.11.21., for Java test exam
 */
abstract class Plant {
    int waterLevel;
    String color;
    public abstract String checkStatus();
    public abstract void waterPlant(double liters);
    String name;

    public String toString() {
        return String.format("The %s %s %s water\n", color, name, checkStatus());
    }
}
