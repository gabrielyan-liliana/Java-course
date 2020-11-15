package oopHomework.model;

public class Bird extends Oviparous {
    private boolean wings = true;
    private boolean fly = true;
    private boolean teeth = false;

    @Override
    public boolean canFly() {
        return fly;
    }

    @Override
    public boolean hasWings() {
        return wings;
    }

    @Override
    public boolean hasTeeth() {
        return teeth;
    }
}
