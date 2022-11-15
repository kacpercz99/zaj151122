import java.util.Arrays;

public class Car extends Vehicle {
    private String brand;


    @Override
    public void start() {
        System.out.println("Car of brand " + brand + " starts.");
    }

    @Override
    public void stop() {
        System.out.println("Car of brand " + brand + " stops");
    }
    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}
