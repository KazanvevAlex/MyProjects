import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Алекс on 18.05.2017.
 */
public class Container extends Item {
    private int maxWeight;
    ArrayList<String> bag = new ArrayList<>();

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Container(String name, int weight, int maxWeight) {
        super(name, weight);
        this.maxWeight = maxWeight;
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public HashSet<String> getProperties() {
        return super.getProperties();
    }

    @Override
    public void setProperties(HashSet<String> properties) {
        super.setProperties(properties);
    }


    void put(Item item) {
        if (item.getWeight() + getWeight() <= maxWeight) {
            bag.add(item.getName());
            setWeight(item.getWeight() + getWeight());
            System.out.println("В "+getName()+" положили "+item.getName());
        } else {
            System.out.println("Контейнер переполнен");
        }
    }

    @Override
    public void getInfo(Item item) {
        super.getInfo(item);

    }
}




