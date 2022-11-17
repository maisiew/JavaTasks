package task3;

public class Planets implements Nameable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Planets(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Название планеты: " + name);
    }
}
