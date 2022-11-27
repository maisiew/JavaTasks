package task1;

public class RPN {
    private double arr[];
    private int top = 0;

    public RPN() { }
    public void push(double x) {
        arr[top] = x;
        top++;
    }

    // pop elements from top of stack
    public double pop() {
        top--;
        return arr[top];
    }

    public String printer(double x) {
        String r = "Результат вычисления: " + x;
        return r;
    }
    public void tester(String str) {
        int nums = 0, signs = 0;
        for(int i = 0; i < str.length(); i++) {
            char h = str.charAt(i);
            if(h >= '0' && h <= '9')
                nums++;
            if (h == '+' || h == '-' || h == '*' || h == '/')
                signs++;
        }
        if(nums != signs + 1){
            System.out.println("Ошибка ввода");
            System.exit(0);
        }
    }
    public void calculate(String str) {
        System.out.println("Вы ввели: " + str);
        tester(str);
        arr = new double[str.length()];
        double rez = 0;
        for (int i = 0; i < str.length(); i++) {
            char h = str.charAt(i);
            if(h == ' ')
                continue;
            if (h >= '0' && h <= '9')
                push(Character.digit(h, 10));
            else if (h == '+' || h == '-' || h == '*' || h == '/') {
                double a, b;
                a = pop();
                b = pop();
                switch(h) {
                    case '*':
                        rez = a*b;
                        break;
                    case '/':
                        if(a == 0) {
                        System.out.println("Случилось деление на 0");
                        System.exit(0);
                        }
                        rez = b/a;
                        break;
                    case '-':
                        rez = b-a;
                        break;
                    case '+':
                        rez = a+b;
                        break;
                }
                push(rez);
            }
            else {
                System.out.println("Ошибка ввода");
                System.exit(0);
            }
        }
        System.out.println(printer(rez));
    }
}

