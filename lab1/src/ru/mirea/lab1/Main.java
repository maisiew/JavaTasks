package ru.mirea.lab1;
import java.util.Scanner;
public class Main {
    public static int fact(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println("Задание 3: ");
        int[] myArr = {1, 2, 3, 4, 5, 4, 3, 2, 7};
        double sumMyArr = 0;
        for (int i = 0; i < myArr.length; i++) {
            sumMyArr += myArr[i];
        }
        double medium = sumMyArr / myArr.length;
        System.out.println("Сумма элементов массива: " + sumMyArr);
        System.out.println("Среднее арифметическое элементов массива: " + medium);
        System.out.println("Задание 4: ");
        System.out.println("Введите 10 элементов массива: ");
        int min = 0, max = 0, sumMyArr2 = 0, helper = 0;
        int[] MyArr2 = new int[10];
        Scanner sc = new Scanner(System.in);
        while (helper < 10) {
            if (sc.hasNextInt()) {
                MyArr2[helper] = sc.nextInt();
                if (max < MyArr2[helper]) {
                    max = MyArr2[helper];
                }
                if (helper == 0) {
                    min = MyArr2[helper];
                } else {
                    if (min > MyArr2[helper]) {
                        min = MyArr2[helper];
                    }
                }
            } else {
                System.out.println("Вы ввели не целое число");
                System.exit(0);
            }
            sumMyArr2 += MyArr2[helper];
            helper += 1;
        }
        System.out.println("Сумма элементов массива: " + sumMyArr2);
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Задание 5: ");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }
        System.out.println("Задание 6: ");
        double i = 1.0;
        for(int k = 1; k < 11; k++) {
            String str = String.format("%s число гармонического ряда: %s", k, i/k);
            System.out.println(str);
        }
        System.out.println("Задание 7: ");
        System.out.println("Введите число, факториал которого нужно вычислить: ");
        Scanner scan = new Scanner(System.in);
        int d = 0;
        if (scan.hasNextInt()) {
            d = scan.nextInt();
            if (d < 0) {
                System.out.println("Вы ввели отрицательное число");
                System.exit(0);
            }
            if (d == 0 || d == 1) {
                System.out.println("Факториал числа " + d + " равен 1");
                System.exit(0);
            }
            int helper2 = d;
            for (int m = d - 1; m > 0; m--) {
                helper2 = fact(helper2, m);
            }
            System.out.println("Факториал числа " + d + " равен " + helper2);
        } else {
            System.out.println("Ошибка");
            System.exit(0);
        }
    }
}