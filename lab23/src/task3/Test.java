package task3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Subtract(new Multiply(new Const(2),
                new Variable("x")), new Const(3)).evaluate(5));
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        System.out.println(new Add(new Subtract(new Variable("x", 3), new Multiply(new Const(4),
                new Variable("x"))), new Const(5)).evaluate(v));
    }
}
