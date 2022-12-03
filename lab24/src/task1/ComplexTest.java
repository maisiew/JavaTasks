package task1;
import java.util.*;

public class ComplexTest {
    public static void main(String[] args) {
        ConcreteFactory numb1 = new ConcreteFactory();
        int real = 0, img = 0;
        try {
            System.out.println("Введите действительную часть числа: ");
            real = new Scanner(System.in).nextInt();
            System.out.println("Введите мнимую часть числа: ");
            img = new Scanner(System.in).nextInt();
        }
        catch (InputMismatchException e ) {
            System.err.println("Вы ввели не число");
            System.exit(0);
        }
        numb1.createComplex();
        numb1.createComplex(real, img);
    }
}
