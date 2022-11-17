package task4;

public class MathFunc implements MathCalculable {
    private String number;
    private int deg;
    private double lengthOfCircle;

    public double getLengthOfCircle() {
        return lengthOfCircle;
    }

    public void setLengthOfCircle(double lengthOfCircle) {
        this.lengthOfCircle = lengthOfCircle;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public MathFunc(String number, int deg) {
        if(number == "0") {
            System.out.println("Ошибка");
            System.exit(0);
        }
        this.number = number;
        this.deg = deg;
    }
    public double[] abfinder(String number) {
        String aa = "";
        String bb = "";
        int i = 0;
        char ch = number.charAt(i);
        if(ch == '-') {
            aa += ch;
            i++;
        }
        while(ch != '+' && ch != '-' && i < number.length()) {
            aa += ch;
            i++;
            ch = number.charAt(i);
        }
        if(ch == '-')
            bb += ch;
        i++;
        ch = number.charAt(i);
        while(ch != 'i' && i < number.length()) {
            bb += ch;
            i++;
            ch = number.charAt(i);
        }
        int a = Integer.parseInt(aa);
        int b = Integer.parseInt(bb);
        double arr[] = {a, b};
        return arr;
    }
    public double modulus() {
        double helper[] = abfinder(number);
        double mod = Math.sqrt((Math.pow(helper[0], 2) + Math.pow(helper[1], 2)));
        return mod;
    }
    public String degree() {
        double helper[] = abfinder(number);
        double m = modulus();
        double r = Math.pow(m, deg);
        double fi = 0;
        if(helper[0] == 0)
            fi = (MathCalculable.Pi)/2;
        if(helper[1] == 0)
            fi = 0;
        if((helper[0] > 0 && helper [1] > 0) || (helper[0] < 0 && helper[1] < 0))
            fi = Math.atan(helper[1]/helper[0]);
        if(helper[0] < 0 && helper[1] > 0)
            fi = MathCalculable.Pi + Math.atan(helper[1]/helper[0]);
        if(helper[0] > 0 && helper[1] < 0)
            fi = -1 * MathCalculable.Pi + Math.atan(helper[1]/helper[0]);
        double a = r * Math.cos(fi*deg);
        double b = r * Math.sin(fi*deg);
        String res = a + "+" + b + "i";
        return res;
    }

    public String toString() {
        String r = "Модуль числа " + number + " равен: " + modulus() +
                ", это число в степени " + deg + " равно: " + degree();
        return r;
    }
}
