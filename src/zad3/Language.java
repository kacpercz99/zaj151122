package zad3;

public interface Language {
    String sayGreeting();
    String sayGoodbye();
    String sayThanks();

    default void printGreeting() {
        System.out.println(sayGreeting());
    }
}
