package app;

import app.models.AnimalCounter;
import app.models.Cat;
import app.models.Dog;

public class L2PR {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурчик");
        Cat cat2 = new Cat("Барсік");
        Dog dog1 = new Dog("Бобік");
        Dog dog2 = new Dog("Умка");

        cat1.run(200);
        cat1.swim(5);

        cat2.run(400);
        cat2.swim(9);

        dog1.run(600);
        dog1.swim(15);

        dog2.run(450);
        dog2.swim(3);

        AnimalCounter.printCount();


    }
}