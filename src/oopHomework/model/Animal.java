package oopHomework.model;

public class Animal {
    private boolean predator;
    private boolean feet;
    private boolean teeth;
    private boolean wings;
    private boolean inRedBook;
    private boolean extinct;
    private boolean fly;
    private boolean bornLive = true;

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

    public boolean isBornLive() {
        return bornLive;
    }

    public void setBornLive(boolean bornLive) {
        this.bornLive = bornLive;
    }

    public String toString(){
        return "Is predator: " + (isPredator() ? "Yes" : "No") + "\n" +
                "Has wings: " + (hasWings() ? "Yes" : "No") + "\n" +
                "Can fly: " + (canFly() ? "Yes" : "No") + "\n" +
                "Has teeth: " + (hasTeeth() ? "Yes" : "No") + "\n" +
                "Has feet: " + (hasFeet() ? "Yes" : "No") + "\n" +
                "In red book: " + (isInRedBook() ? "Yes" : "No") + "\n" +
                "Is extinct: " + (isExtinct() ? "Yes" : "No") + "\n" +
                (isBornLive() ? "Born live" : "Born in eggs");
    }

    public void printInfo() {
        System.out.println(this);
    }
}
