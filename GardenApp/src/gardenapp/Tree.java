package gardenapp;

/**
 * Created by Söp on 2016.11.21., for Java test exam
 */
public class Tree extends Plant {

    public Tree(String color) {
        this.comfortWaterLevel = 10;
        this.color = color;
        this.name = "tree";
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
