package zad3;

public class English implements Language{
    @Override
    public String sayGreeting() {
        return "Hello";
    }

    @Override
    public String sayGoodbye() {
        return "Goodbye";
    }

    @Override
    public String sayThanks() {
        return "Thanks";
    }
}
