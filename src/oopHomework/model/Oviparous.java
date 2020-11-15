package oopHomework.model;

public class Oviparous extends Mammal {
    private boolean bornLive = false;

    @Override
    public boolean isBornLive() {
        return bornLive;
    }

    public Oviparous() {
        super();
    }
}
