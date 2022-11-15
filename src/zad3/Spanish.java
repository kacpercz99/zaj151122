package zad3;

public class Spanish implements Language{
    @Override
    public String sayGreeting() {
        return "Hola";
    }

    @Override
    public String sayGoodbye() {
        return "adiós";
    }

    @Override
    public String sayThanks() {
        return "Gracias";
    }
}
