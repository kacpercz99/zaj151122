public class Vehicle implements Movable{

    @Override
    public void start() {
        System.out.println("The vehicle starts to drive.");
    }

    @Override
    public void stop() {
        System.out.println("The vehicle stops.");
    }
}
