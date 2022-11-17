package ru.mirea.lab3;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        //рандом, номер 4
        int[] myArr = new int[4];
        Random rand = new Random();
        String s = "";
        boolean b = true;
        for (int i = 0; i < 4; i++) {
            myArr[i] = rand.nextInt(90) + 10;
            s = s + myArr[i] + " ";
            if (i > 0 && myArr[i] < myArr[i - 1])
                b = false;
        }
        System.out.println(s);
        if (b)
            System.out.println("Последовательность строго возрастающая");
        else
            System.out.println("Последовательность не является строго возрастающей");

        //оболочки, задание 2
        String str = "13.4324";
        double val = Double.parseDouble(str);
        System.out.println(val);

        //форматирование, задание 1
        System.out.println("Выберите вашу валюту: " + '\n' +
                "1. Китайский юань;" + '\n' +
                "2. Доллар США; " + '\n' +
                "3. Канадский доллар;" + '\n' +
                "4. Японская иена; " + '\n' +
                "5. Вон республики Корея; " + '\n' +
                "6. Фунт стерлингов; " + '\n' +
                "7. Евро; ");
        Scanner sc1 = new Scanner(System.in);
        int pos = sc1.nextInt();
        if(pos < 1 || pos > 7) {
            System.out.println("Такой валюты нет в списке");
            System.exit(0);
        }
        System.out.println("Введите количество валюты: ");
        Scanner sc2 = new Scanner(System.in);
        double money = sc2.nextDouble();
        System.out.println("Конвертация...");
        Convertor conv = new Convertor();
        if(pos < 7)
            Locale.setDefault(Locale.ITALY);
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            money = conv.toEuro(money, pos);
            System.out.println("В евро: " + nf.format(money));
        if(pos == 1){
            conv.usa(money);
            conv.canada(money);
            conv.japan(money);
            conv.korea(money);
            conv.uk(money);
        }
        if(pos == 2){
            conv.canada(money);
            conv.china(money);
            conv.japan(money);
            conv.korea(money);
            conv.uk(money);
        }
        if(pos == 3){
            conv.usa(money);
            conv.china(money);
            conv.japan(money);
            conv.korea(money);
            conv.uk(money);
        }
        if(pos == 4) {
            conv.usa(money);
            conv.canada(money);
            conv.china(money);
            conv.korea(money);
            conv.uk(money);
        }
        if(pos == 5){
            conv.usa(money);
            conv.canada(money);
            conv.china(money);
            conv.japan(money);
            conv.uk(money);
        }
        if(pos == 6){
            conv.usa(money);
            conv.canada(money);
            conv.china(money);
            conv.japan(money);
            conv.korea(money);
        }
        if(pos == 7) {
            conv.usa(money);
            conv.canada(money);
            conv.china(money);
            conv.japan(money);
            conv.korea(money);
            conv.uk(money);
        }
    }
}