package task1;

public class CalcTest {
    public static void main(String[] args) {
        RPN test = new RPN();
        double h1, h2, h3;
        h1 = 4 + 5 * 6;
        h1 = 3 - h1;
        h1 = 2/h1;
        h2 = (2 * 3) + (4 * 5);
        h3 = 2 + 3;
        test.calculate("2 3 4 5 6 * + - /");
        System.out.println("Проверка: " + h1);
        test.calculate("2 3 * 4 5 * +");
        System.out.println("Проверка: " + h2);
        test.calculate("2 3 +");
        System.out.println("Проверка: " + h3);
        test.calculate("2 0 /");
    }
}
