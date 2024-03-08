import java.util.ArrayList;

public class Farm {
    private ArrayList<Animal> animals  = new ArrayList();

    public void addAnimal(Animal animal){
        if (!animals.contains(animal) && animal.getSize() == Size.SMALL){
            animals.add(animal);
        }
    }
    private int countSize(boolean isSmall){
        int count = 0;
        for (Animal animal : animals){
            if (isSmall && animal.getSize() == Size.SMALL){
                count++;
            } else if(!isSmall && animal.getSize() == Size.BIG){
                count++;
            }
        }
        return count;
    }
}
