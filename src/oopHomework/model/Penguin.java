package oopHomework.model;

public class Penguin extends Bird{
    private boolean fly = false;

    @Override
    public boolean canFly() {
        return fly;
    }
}
