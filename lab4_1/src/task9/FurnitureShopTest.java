package task9;

public class FurnitureShopTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(2);
        shop.add(new Wardrobe(
                "Гардероб для прихожей", 0, 2.05, 1, 1, 14540, "Металл+Дуб", 3, 10));
        shop.add(new Table(
                "Складной стол", 4, 1.3, 1, 1, 5999, "Дуб", 2));
        System.out.println(shop.getPrices());
        System.out.println("Куплено: "+ shop.buy(3));
        System.out.println(shop.getPrices());
    }
}
