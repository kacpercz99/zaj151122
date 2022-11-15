import zad1.Car;
import zad1.Movable;
import zad1.Vehicle;
import zad2.TransportService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //zad1
//        Car car1 = new Car("bmw");
//        Car car2 = new Car("volvo");
//        Vehicle vehicle1 = new Vehicle();
//        race(car1,car2,vehicle1);
        //zad2
        TransportService transportService = new TransportService();
        transportService.moveEverything();
    }

    public static void race(Movable... movables) {
        System.out.println("START OF THE RACE!!!");
        Arrays.stream(movables).forEach(Movable::start);
    }
}
