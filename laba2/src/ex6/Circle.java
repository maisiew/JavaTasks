package ex6;

public class Circle {
    private double x, y, r;
    public Circle() { }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public void move(double xDisp, double yDisp) {
        setX(x+xDisp);
        setY(y+yDisp);
    }
    public void radius(double rad) {
        setR(r+rad);
    }
    public double getLength(double ra) {
        return Math.PI * 2 * ra;
    }

    public double getArea(double ra) {
        return Math.PI * ra * ra;
    }

    public void compare(double ra1, double ra2) {
        if(ra1 > ra2) {
            String res = "The first circle is larger than the second";
            System.out.println(res);
        }
        if(ra1 < ra2) {
            String res = "The second circle is larger than the first";
            System.out.println(res);
        }
        if(ra1 == ra2) {
            String res = "The circles are equal";
            System.out.println(res);
        }
    }

    public String toString() {
        String res = "Circle{" +
                "x = " + x +
                ", y = " + y + ", r= " +
                r + ", circumference length = " +
                getLength(r) + ", area of the circle = " +
                getArea(r) + '}';
        return res;
    }
}
