package gardenapp;

/**
 * Created by Söp on 2016.11.21..
 */
public class Tree extends Plant {

    public Tree(String color) {
        this.color = color;
        this.name = "tree";
    }

    @Override
    public String checkStatus() {
        if (waterLevel < 10) {
            return "needs";
        } else {
            return "doesn't need";
        }
    }

    @Override
    public void waterPlant(double liters) {
        this.waterLevel += liters * 0.4;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
