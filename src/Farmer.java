import java.util.ArrayList;

public class Farmer {
    private ArrayList<Flower> flowers= new ArrayList<>();
    private int fieldSize = 100;

    public void addFlower(Flower flower){
        if (flower.getNeededArea() <= fieldSize){
            flowers.add(flower);
            fieldSize -= (int) flower.getNeededArea();
        }
    }

    public void harvestFlower(Flower flower){
        if (flowers.contains(flower)){
            flowers.remove(flower);
            fieldSize += (int) flower.getNeededArea();
        }
    }
    public void waterFlower(Flower flower){
        if (flowers.contains(flower)){

        }
    }
}
