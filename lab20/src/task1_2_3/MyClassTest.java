package task1_2_3;

public class MyClassTest {
    public static void main(String[] args) {
    MyClass<String, Pet, Double> variable = new MyClass<>("Hello", new Pet(), 39.05453);
    System.out.println(variable);
    }
}
