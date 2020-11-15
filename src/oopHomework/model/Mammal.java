package oopHomework.model;

public class Mammal extends Animal {
    private boolean feet = true;
    private boolean teeth = true;

    @Override
    public boolean hasFeet() {
        return feet;
    }

    @Override
    public boolean hasTeeth() {
        return teeth;
    }
}
