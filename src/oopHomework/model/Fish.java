package oopHomework.model;

public class Fish extends Animal {
    private boolean feet = false;
    private boolean fly = false;

    @Override
    public boolean hasFeet() {
        return feet;
    }

    @Override
    public boolean canFly() {
        return fly;
    }

    public void swim() {
        System.out.println("Fish is swimming");
    }
}
