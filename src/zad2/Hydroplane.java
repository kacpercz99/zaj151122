package zad2;

public class Hydroplane implements Swimable, Flyable{
    @Override
    public void fly() {
        System.out.println("Hydroplane flies");
    }

    @Override
    public void swim() {
        System.out.println("Hydroplane swims");
    }
}
