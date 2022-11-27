package task1_2_3;

public class MyClass<T extends String, V extends Animal, K extends Number> {
    private T var1;
    private V var2;
    private K var3;

    public MyClass(T var1, V var2, K var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public String toString() {
        return var1 + " (" + var1.getClass() +
                ")" + '\n' +
                var2 + " (" + var2.getClass() +
                ")" + '\n' +
                var3 + " (" + var3.getClass() +
                ")";
    }
}
