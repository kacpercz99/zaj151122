package zad1;

public abstract class Animal {
    private String name = "bez imieina";

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getType();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
