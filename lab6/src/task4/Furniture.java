package task4;

public class Furniture implements Priceable {
    private double price;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void getPrice() {
        System.out.println("Модель: " + model + "; цена: " + price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Furniture(double price, String model) {
        this.price = price;
        this.model = model;
    }
}
