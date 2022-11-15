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
        System.out.println("The dog stopped.");
    }

    @Override
    public String getVoice(int voice) {
        if(voice == QUIET) {
            return "woof woof";
        } else if(voice == LOUD) {
            return "WOOF WOOF";
        } else return "";
    }
}
