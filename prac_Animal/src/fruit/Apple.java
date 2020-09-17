package fruit;

public class Apple extends Fruit {
    String name;
    public Apple() {
        name = "táo";
    }

    @Override
    public String howToEat(){
        return " eat apple: slide";
    }
}
