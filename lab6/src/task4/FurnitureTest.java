package task4;

public class FurnitureTest {
    public static void main(String[] args) {
        Priceable table = new Furniture(5600, "Стол складной");
        Priceable chair = new Furniture(3599, "Стул для рыбалки");
        Priceable wardrobe = new Furniture(15499, "Гардероб для прихожей");
        table.getPrice();
        chair.getPrice();
        wardrobe.getPrice();
    }
}
