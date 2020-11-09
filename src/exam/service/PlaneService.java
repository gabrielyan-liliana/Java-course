package exam.service;

import exam.model.Plane;

public class PlaneService {
    public void printInfo(Plane plane) {
        System.out.println("Model: " + plane.getModel());
        System.out.println("Country: " + plane.getCountry());
        System.out.println("Year: " + plane.getYear());
        System.out.println("Hours: " + plane.getHours());
        System.out.println("Military: " + (plane.isMilitary() ? "yes" : "no"));
        System.out.println("EngineType: " + plane.getEngineType());
        System.out.println("Weight: " + plane.getWeight());
        System.out.println("Wingspan: " + plane.getWingspan());
        System.out.println("TopSpeed: " + plane.getTopSpeed());
        System.out.println("Seats: " + plane.getSeats());
        System.out.println("Cost: " + plane.getCost());
    }

    public Plane getNewerPlane(Plane plane1, Plane plane2) {
        return plane1.getYear() > plane2.getYear() ? plane2 : plane1;
    }

    public void printSomeInfo(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println("Cost: " + plane.getCost());
            System.out.println("TopSpeed: " + plane.getTopSpeed());
        } else {
            System.out.println("Model: " + plane.getModel());
            System.out.println("Country: " + plane.getCountry());
        }
    }

    public Plane getBiggerWingspanPlane(Plane plane1, Plane plane2) {
        return plane1.getWingspan() > plane2.getWingspan() ? plane1 : plane2;
    }

    public Plane getHignestCostPlane(Plane plane1, Plane plane2, Plane plane3) {
        Plane maxCost = plane1;
        if (plane2.getCost() > maxCost.getCost()) {
            maxCost = plane2;
        }
        if (plane3.getCost() > maxCost.getCost()) {
            maxCost = plane3;
        }
        return maxCost;
    }

    public Plane getSmallestSeatsPlane(Plane plane1, Plane plane2, Plane plane3) {
        Plane minSeats = plane1;
        if (plane2.getSeats() < minSeats.getSeats()) {
            minSeats = plane2;
        }
        if (plane3.getCost() < minSeats.getSeats()) {
            minSeats = plane3;
        }
        return minSeats;
    }

    public void printNotMilitaryPlanes(Plane[] planes) {
        for (Plane plane: planes) {
            if (!plane.isMilitary()) {
                printInfo(plane);
            }
        }
    }

    public void printNotMilitaryLongFlyingPlanes(Plane[] planes) {
        for (Plane plane: planes) {
            if (!plane.isMilitary() && plane.getHours() > 100) {
                printInfo(plane);
            }
        }
    }

    public Plane printMinWeightPlane(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() <= min.getWeight()) {
                min = planes[i];
            }
        }
        return min;
    }



    public Plane printMinMilitaryCostPlane(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() < min.getWeight() && planes[i].isMilitary()) {
                min = planes[i];
            }
        }
        return min;
    }

    public void sortAscByYear(Plane[] planes) {
        Plane temp;
        for (int i = 0; i < planes.length; i++) {
            for (int j = i + 1; j < planes.length; j++) {
                if (planes[i].getYear() > planes[j].getYear())
                {
                    temp = planes[i];
                    planes[i] = planes[j];
                    planes[j] = temp;
                }
            }
        }
        for (Plane plane: planes) {
            printInfo(plane);
        }
    }

    public void printNotMilitaryPlanesInDescendingOrderBySeats(Plane[] planes) {
        sortDescBySeats(planes);
        for (int i = 0; i < planes.length; i++) {
            System.out.println("plane " + (i + 1));
            if(!planes[i].isMilitary()) {
                printInfo(planes[i]);
            }
        }
    }

    private void sortDescBySeats(Plane[] planes) {
        boolean sorted;
        for(int i = 0; i < planes.length - 1; i++) {
            sorted = true;
            for(int j = 0; j < planes.length - 1 - i; j++) {
                if(planes[j + 1].getSeats() > planes[j].getSeats()) {
                    Plane tmp = planes[j];
                    planes[j]  = planes[j + 1];
                    planes[j + 1] = tmp;
                    sorted = false;
                }
            }
            if(sorted) {
                break;
            }
        }
    }

    }
