import edible.Edible;
public class Apple implements Edible {
    String name;
    public Apple() {
        name = "táo";
    }

    @Override
    public String howToEat(){
        return "slide";
    }
}
