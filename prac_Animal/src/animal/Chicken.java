package animal;

import edible.Edible;
public class Chicken extends Animal implements Edible  {
    public Chicken() {
        name = "chicken";
    }

    @Override
    public String makeSound() {
        return "gàaa";
    }

    @Override
    public String howToEat() {
        return "fried";
    }
}
