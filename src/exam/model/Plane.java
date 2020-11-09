package exam.model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean military;
    private String engineType;
    private int weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() < 0 ) {
            System.out.println("Plane model should not be empty! Default value will be set.");
            this.model = "DefaultModelName";
        } else {
            this.model = model;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.length() < 0 ) {
            System.out.println("Country should not be empty! Default value will be set.");
            this.country = "Armenia";

        } else {
            this.country = country;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 1903 || year > 2020) {
            System.out.println("Year should be from 1903 to 2020! Default value will be set.");
            this.year = 2020;
        } else {
            this.year = year;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours <= 0 || hours > 10000) {
            System.out.println("Hours should be from 0 to 10000! Default value will be set.");
        } else {
            this.hours = hours;
        }
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if (engineType.length() < 0 ) {
            System.out.println("engineType should be empty! Default value will be set.");
            this.engineType = "DefaultEngineType";
        } else {
            this.engineType = engineType;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 1000 || weight > 160000) {
            System.out.println("Weight should be from 1000 to 160000! Default value will be set.");
            this.weight = 10000;
        } else {
            this.weight = weight;
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan < 10 || weight > 45) {
            System.out.println("Wingspan should be from 1000 to 160000! Default value will be set.");
            this.wingspan = 20;
        } else {
            this.wingspan = wingspan;
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed < 0 || topSpeed > 1000) {
            System.out.println("TopSpeed should be from 0 to 1000!  Default value will be set.");
            this.topSpeed = 500;
        } else {
            this.topSpeed = topSpeed;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats < 0) {
            System.out.println("Seats number should not be negative!  Default value will be set.");
            this.seats = 20;
        } else {
            this.seats = seats;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost < 0) {
            System.out.println("Cost number should not be negative! Default value will be set.");
            this.cost = 1000.5;
        } else {
            this.cost = cost;
        }
    }
}
