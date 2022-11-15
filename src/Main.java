import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("bmw");
        Car car2 = new Car("volvo");
        Vehicle vehicle1 = new Vehicle();
        race(car1,car2,vehicle1);
    }

    public static void race(Movable... movables) {
        Arrays.stream(movables).forEach(Movable::start);
    }
}
