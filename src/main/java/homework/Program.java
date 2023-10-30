package homework;

public class Program {
    public static void main(String[] args) {

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        System.out.println(orangeBox.getWeigth());
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        System.out.println(appleBox.getWeigth());
        System.out.println(orangeBox.compare(appleBox));
        Box<Fruit> orangeBox1 = new Box<>();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox.shift(orangeBox1);
        System.out.println(orangeBox1.getWeigth());
        try{
            appleBox.shift(orangeBox1);
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        try{
            orangeBox1.add(new Apple());
            orangeBox1.add(new Apple());
            orangeBox1.add(new Apple());
        } catch (RuntimeException e){
            System.out.println(e);
        }

    }
}
