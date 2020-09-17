package animal;

import edible.Edible;

public class Tiger extends Animal implements Edible{
    public Tiger() {
        this.name = "tiger";
    }

    @Override
    public String makeSound() {
        return "hổ";
    }

    @Override
    public String howToEat() {
        return "thịt";
    }
}
