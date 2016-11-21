package gardenapp;

/**
 * Created by Söp on 2016.11.21..
 */
abstract class Plant {
    public int waterLevel;
    public String color;
    public abstract String checkStatus();
    public abstract void waterPlant(double liters);
    public String name;

    public String toString() {
        return String.format("The %s %s %s water\n", color, name, checkStatus());
    }

}
