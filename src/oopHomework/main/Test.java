package oopHomework.main;

import oopHomework.model.Animal;
import oopHomework.model.Bird;
import oopHomework.model.Penguin;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.printInfo();

        Bird bird = new Bird();
        bird.setWings(false);
        bird.printInfo(); // will not have wings anyway

        Penguin penguin = new Penguin();
        penguin.setFly(true);
        penguin.printInfo(); // cannot fly anyway
    }
}
