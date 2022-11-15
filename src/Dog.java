import java.util.Random;

public class Dog extends Animal implements Movable, Speakable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public void start() {
        System.out.println("The dog is now moving.");
    }

    @Override
    public void stop() {
        System.out.println("The dog stops.");
    }

    @Override
    public String getVoice(int voice) {
        return "Woof woof";
    }
}
