package oopHomework.model;

public class Reptiles extends Oviparous {
    private boolean poisoned = true;

    public boolean isPoisoned() {
        return poisoned;
    }

    public void setPoisoned(boolean poisoned) {
        this.poisoned = poisoned;
    }
}
