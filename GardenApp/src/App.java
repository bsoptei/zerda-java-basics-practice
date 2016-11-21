import gardenapp.*;

/**
 * Created by Söp on 2016.11.21., for Java test exam
 */
public class App {
    public static void main(String[] args) {
        Garden myLittleGarden = new Garden();

        myLittleGarden.addPlant(new Flower("yellow"));
        myLittleGarden.addPlant(new Flower("blue"));
        myLittleGarden.addPlant(new Tree("purple"));
        myLittleGarden.addPlant(new Tree("orange"));
        
        System.out.print(myLittleGarden.toString());
        System.out.println(myLittleGarden.water(40));
        System.out.print(myLittleGarden.toString());
        System.out.println(myLittleGarden.water(70));
        System.out.print(myLittleGarden.toString());
    }
}
