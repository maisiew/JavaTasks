package ru.mirea.lab3;

import java.text.NumberFormat;
import java.util.Locale;

public class Convertor {
    private double money;

    public Convertor() {
    }

    public void china(double m) {
        Locale.setDefault(Locale.CHINA);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("В валюте Китая: " + nf.format(m * 7.2862));
    }

    public void usa(double m) {
        Locale.setDefault(Locale.US);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("В валюте США: " + nf.format(m * 1.022));
    }

    public void canada(double m) {
        Locale.setDefault(Locale.CANADA);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("В валюте Канады: " + nf.format(m * 1.3672));
    }

    public void japan(double m) {
        Locale.setDefault(Locale.JAPAN);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("В валюте Японии: " + nf.format(m * 145.5814));
    }

    public void korea(double m) {
        Locale.setDefault(Locale.KOREA);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("В валюте Кореи: " + nf.format(m * 1347.382));
    }

    public void uk(double m) {
        Locale.setDefault(Locale.UK);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("В валюте Великобритании: " + nf.format(m * 0.87538));
    }

    public double toEuro(double m, int k) {
        if (k == 1)
            m = m / 7.2862;
        if (k == 2)
            m = m / 1.022;
        if (k == 3)
            m = m / 1.3672;
        if (k == 4)
            m = m / 145.5814;
        if (k == 5)
            m = m / 1347.382;
        if (k == 6)
            m = m / 0.87538;
        return m;
    }
}
