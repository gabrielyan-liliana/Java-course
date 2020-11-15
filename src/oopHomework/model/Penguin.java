package oopHomework.model;

public class Penguin extends Bird {
    private boolean fly = false;
    private boolean inRedBook = true;

    @Override
    public boolean canFly() {
        return fly;
    }

    @Override
    public boolean isInRedBook() {
        return inRedBook;
    }
}
