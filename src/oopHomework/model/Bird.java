package oopHomework.model;

public class Bird extends Oviparous {
    private boolean wings = true;
    private boolean fly = true;

    @Override
    public boolean hasWings() {
        return wings;
    }
}
