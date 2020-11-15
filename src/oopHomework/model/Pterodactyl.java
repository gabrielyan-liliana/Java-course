package oopHomework.model;

public class Pterodactyl extends Dinosaur {
    private boolean wings = true;
    private boolean fly = true;
    private boolean predator = true;

    @Override
    public boolean canFly() {
        return fly;
    }

    @Override
    public boolean hasWings() {
        return wings;
    }

    @Override
    public boolean isPredator() {
        return predator;
    }
}
