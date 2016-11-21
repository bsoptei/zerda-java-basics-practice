package gardenapp;

/**
 * Created by Söp on 2016.11.21., for Java test exam
 */
public class Flower extends Plant {

    public Flower(String color) {
        this.comfortWaterLevel = 5;
        this.color = color;
        this.name = "flower";
    }

    @Override
    public void waterPlant(double liters) {
        this.waterLevel += liters * 0.75;
    }
}
