package gardenapp;

/**
 * Created by Söp on 2016.11.21., for Java test exam
 */
public class Tree extends Plant {

    public Tree(String color) {
        super("tree", color);
        this.comfortWaterLevel = 10;
        this.absorbanceCapacity = 0.4;
    }
}
