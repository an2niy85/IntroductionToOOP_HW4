package homework;

import java.util.ArrayList;
import java.util.Map;

public class Box<T extends Fruit> {

    private int count;
    private float weigth;

    private ArrayList<Fruit> fruits = new ArrayList<>();

    public boolean compare(Box box){
        return this.getWeigth() == box.getWeigth();
    }

    public void add(Fruit fruit){
        if(fruits.size() > 0){
            if(fruits.get(0).getClass() != fruit.getClass())
                throw new RuntimeException("Внимание! Смешивать товары запрещено, используйте другой товар или коробку!");
        }
        fruits.add(fruit);
    }

    public void add(Fruit[] fruits2){
        if(fruits.size() > 0){
            if(fruits.get(0).getClass() != fruits2[0].getClass())
                throw new RuntimeException("Внимание! Смешивать товары запрещено, используйте другой товар или коробку!");
        }
        for (Fruit fruit: fruits2) {
            fruits.add(fruit);
        }

    }

    public float getWeigth() {
        return fruits.size()*fruits.get(0).getWeight();
    }

    public int getCount() {
        return fruits.size();
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void shift(Box<Fruit> fruits1){
        //(Fruits)fruits1;
        if(fruits.size() > 0) {
            if(fruits.get(0).getClass() != fruits1.getProduct().get(0).getClass())
                throw new RuntimeException("Внимание! Смешивать товары запрещено, используйте другой товар или коробку!");
            else {
                for (Fruit fruit: fruits) {
                    fruits1.getProduct().add(fruit);
                }
                this.setCount(0);
            }
        }
    }

//    private void addAll(Box<Fruit> tBox) {
//        tBox.add((Box)fruits);
//    }

    private ArrayList<Fruit> getProduct() {
        return fruits;
    }
}
