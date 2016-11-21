package gardenapp;

/**
 * Created by Söp on 2016.11.21..
 */
public class Flower extends Plant {

    public Flower(String color) {
        this.color = color;
        this.name = "flower";
    }

    @Override
    public String checkStatus() {
        if (waterLevel < 5) {
            return "needs";
        } else {
            return "doesn't need";
        }
    }

    @Override
    public void waterPlant(double liters) {
        this.waterLevel += liters * 0.75;
    }
}
