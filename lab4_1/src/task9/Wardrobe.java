package task9;

public class Wardrobe extends Furniture {
    private String material;
    private int numberOfShelves;
    private int numberOfHangers;
    public Wardrobe(String modelName, int legCount, double height, double width, double depth, int price, String material, int numberOfShelves, int numberOfHangers) {
        super(modelName, height, width, depth, legCount, price);
        this.material = material;
        this.numberOfShelves = numberOfShelves;
        this.numberOfHangers = numberOfHangers;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public void setNumberOfShelves(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }

    public int getNumberOfHangers() {
        return numberOfHangers;
    }

    public void setNumberOfHangers(int numberOfHangers) {
        this.numberOfHangers = numberOfHangers;
    }
    @Override
    public String toString() {
        return "Wardrobe{" +
                "material='" + material + '\'' +
                ", numberOfHangers=" + numberOfHangers + ", numberOfShelves=" +
                numberOfShelves + ", " + super.toString() + '}';
    }
}
