package oopHomework.model;

public class Animal {
    private boolean predator;
    private boolean feet;
    private boolean teeth;
    private boolean wings;
    private boolean inRedBook;
    private boolean extinct;
    private boolean fly;

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    public boolean hasFeet() {
        return feet;
    }

    public void setFeet(boolean feet) {
        this.feet = feet;
    }

    public boolean hasTeeth() {
        return teeth;
    }

    public void setTeeth(boolean teeth) {
        this.teeth = teeth;
    }

    public boolean hasWings() {
        return wings;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }

    public boolean isInRedBook() {
        return inRedBook;
    }

    public void setInRedBook(boolean inRedBook) {
        this.inRedBook = inRedBook;
    }

    public boolean isExtinct() {
        return extinct;
    }

    public void setExtinct(boolean extinct) {
        this.extinct = extinct;
    }

    public boolean canFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public void printInfo() {
        System.out.println("Is predator: " + (this.isPredator() ? "Yes" : "No"));
        System.out.println("Has wings: " + (this.hasWings() ? "Yes" : "No"));
        System.out.println("Can fly: " + (this.canFly() ? "Yes" : "No"));
        System.out.println("Has teeth: " + (this.hasTeeth() ? "Yes" : "No"));
        System.out.println("Has feet: " + (this.hasFeet() ? "Yes" : "No"));
        System.out.println("In red book: " + (this.isInRedBook() ? "Yes" : "No"));
        System.out.println("Is extinct: " + (this.isExtinct() ? "Yes" : "No"));
    }
}
