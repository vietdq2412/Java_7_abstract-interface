import animal.Animal;
import animal.Chicken;
import animal.Tiger;



public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        System.out.println(animals[0].makeSound());
//        for (Animal animal : animals) {
//            animal.makeSound();
//        }

        Apple tao = new Apple();
        System.out.println(tao.howToEat());

    }
}
