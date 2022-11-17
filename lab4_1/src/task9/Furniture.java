package task9;

public abstract class Furniture {

    private String modelName;
    private double height;
    private double width;
    private double depth;
    private int legCount;
    private int price;

    public Furniture(String modelName, double height, double width, double depth, int legCount, int price) {
        this.modelName = modelName;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.legCount = legCount;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "modelName=" + modelName +
                ", legCount=" + legCount +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", price=" + price;
    }
}
