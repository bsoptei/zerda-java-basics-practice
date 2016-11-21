package gardenapp;

/**
 * Created by Söp on 2016.11.21., for Java test exam
 */
public class Flower extends Plant {

    public Flower(String color) {
        super("flower", color);
        this.comfortWaterLevel = 5;
        this.absorbanceCapacity = 0.75;
    }
}
