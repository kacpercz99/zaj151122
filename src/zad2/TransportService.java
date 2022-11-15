package zad2;

public class TransportService {
    public void moveEverything() {
        Plane plane = new Plane();
        Ship ship = new Ship();
        Hydroplane hydroplane = new Hydroplane();
        plane.fly();
        ship.swim();
        hydroplane.fly();
        hydroplane.swim();
        Flyable flyingHydroPlane = new Hydroplane();
        flyingHydroPlane.fly();
        //nie mozna flyingHydroPlane.swim();
        Swimable swimmingHydroPlane = new Hydroplane();
        swimmingHydroPlane.swim();
    }
}
