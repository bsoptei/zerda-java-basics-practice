package gardenapp;

import java.util.ArrayList;

/**
 * Created by Söp on 2016.11.21., for Java test exam
 */
public class Garden {
    private ArrayList<Plant> plants;

    public Garden() {
        this.plants = new ArrayList<>();
    }

    public String water(double liters) {
        for (Plant plant : plants) {

            plant.waterPlant(liters / plants.size());
        }
        return String.format("Watering with %.0f", liters);
    }

    public void addPlant(Plant plant) {
        this.plants.add(plant);
    }

    public String toString() {
        StringBuilder myPlants = new StringBuilder();
        for (Plant plant: plants)
        myPlants.append(plant.toString());
        return myPlants.toString();
    }

}
