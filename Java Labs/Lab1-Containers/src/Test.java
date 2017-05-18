/**
 * Created by Алекс on 18.05.2017.
 */
public class Test {

    public static void main(String[] args) {
    Container container = new Container("cont1", 1,100 );
    Container container2 = new Container("item1",68 ,100 );
    Container container3 = new Container("item2", 55,100 );
    container.put(container2);
    container.put(container3);
    container.getInfo(container);
    }
}