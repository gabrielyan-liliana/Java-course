package exam.main;

import exam.service.PlaneService;
import exam.model.Plane;
import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService ps = new PlaneService();
        Plane plane1 = new Plane();
        System.out.println("Enter plane1 info");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter model");
        String model = sc.next();
        plane1.setModel(model);

        System.out.println("Enter country");
        String country = sc.next();
        plane1.setCountry(country);

        System.out.println("Enter year");
        int year = sc.nextInt();
        plane1.setYear(year);

        System.out.println("Enter military (yes for true and anything else for no)");
        String military = sc.next();
        plane1.setMilitary(military == "yes");

        System.out.println("Enter engineType");
        String engineType = sc.next();
        plane1.setEngineType(engineType);

        System.out.println("Enter topSpeed");
        int topSpeed = sc.nextInt();
        plane1.setTopSpeed(topSpeed);

        System.out.println("Enter weight");
        int weight = sc.nextInt();
        plane1.setWeight(weight);

        System.out.println("Enter wingspan");
        int wingspan = sc.nextInt();
        plane1.setWingspan(wingspan);

        System.out.println("Enter seats");
        int seats = sc.nextInt();
        plane1.setSeats(seats);

        System.out.println("Enter cost");
        int cost = sc.nextInt();
        plane1.setCost(cost);

        ps.printInfo(plane1);

        Plane plane2 = new Plane();
        System.out.println("Enter plane2 info");

        System.out.println("Enter model");
        model = sc.next();
        plane2.setModel(model);

        System.out.println("Enter country");
        country = sc.next();
        plane2.setCountry(country);

        System.out.println("Enter year");
        year = sc.nextInt();
        plane2.setYear(year);

        System.out.println("Enter military (yes for true and anything else for no)");
        military = sc.next();
        plane2.setMilitary(military == "yes");

        System.out.println("Enter engineType");
        engineType = sc.next();
        plane2.setEngineType(engineType);

        System.out.println("Enter topSpeed");
        topSpeed = sc.nextInt();
        plane2.setTopSpeed(topSpeed);

        System.out.println("Enter weight");
        weight = sc.nextInt();
        plane2.setWeight(weight);

        System.out.println("Enter wingspan");
        wingspan = sc.nextInt();
        plane2.setWingspan(wingspan);

        System.out.println("Enter seats");
        seats = sc.nextInt();
        plane2.setSeats(seats);

        System.out.println("Enter cost");
        cost = sc.nextInt();
        plane2.setCost(cost);


        Plane plane3 = new Plane();
        System.out.println("Enter plane2 info");

        System.out.println("Enter model");
        model = sc.next();
        plane3.setModel(model);

        System.out.println("Enter country");
        country = sc.next();
        plane3.setCountry(country);

        System.out.println("Enter year");
        year = sc.nextInt();
        plane3.setYear(year);

        System.out.println("Enter military (yes for true and anything else for no)");
        military = sc.next();
        plane3.setMilitary(military == "yes");

        System.out.println("Enter engineType");
        engineType = sc.next();
        plane3.setEngineType(engineType);

        System.out.println("Enter topSpeed");
        topSpeed = sc.nextInt();
        plane3.setTopSpeed(topSpeed);

        System.out.println("Enter weight");
        weight = sc.nextInt();
        plane3.setWeight(weight);

        System.out.println("Enter wingspan");
        wingspan = sc.nextInt();
        plane3.setWingspan(wingspan);

        System.out.println("Enter seats");
        seats = sc.nextInt();
        plane3.setSeats(seats);

        System.out.println("Enter cost");
        cost = sc.nextInt();
        plane3.setCost(cost);
        ps.printSomeInfo(plane2);

        ps.getBiggerWingspanPlane(plane1, plane2);
        ps.getHignestCostPlane(plane1, plane2, plane3);
        ps.getSmallestSeatsPlane(plane1, plane2, plane3);
        ps.printNotMilitaryPlanes(new Plane[]{plane1, plane2, plane3});
        ps.printNotMilitaryLongFlyingPlanes(new Plane[]{plane1, plane2, plane3});
        ps.printMinWeightPlane(new Plane[]{plane1, plane2, plane3});
        ps.printMinMilitaryCostPlane(new Plane[]{plane1, plane2, plane3});
        ps.sortAscByYear(new Plane[]{plane1, plane2, plane3});
        ps.printNotMilitaryPlanesInDescendingOrderBySeats(new Plane[]{plane1, plane2, plane3});



    }
}
