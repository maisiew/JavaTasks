package ex2;

public class TestBall {
    public static void main(String[] args) {
        Ball myach = new Ball();
        System.out.println(myach);
        myach.setXY(5.3, 3.5);
        System.out.println(myach);
        myach.move(12, 3.7);
        System.out.println(myach.toString());
    }
}
