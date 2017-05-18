import java.util.HashSet;

/**
 * Created by Алекс on 18.05.2017.
 */
public abstract class Item {
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", properties=" + properties +
                '}';
    }


    private String name;
    private int weight;
    HashSet<String> properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public HashSet<String> getProperties() {
        return properties;
    }

    public void setProperties(HashSet<String> properties) {
        this.properties = properties;
    }


    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }
    public void getInfo(Item item){
        System.out.println(item);
    }

   }



