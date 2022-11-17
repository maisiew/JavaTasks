package ru.mirea.lab4;

public class Main {
    public static void finder(Season season) {
        switch (season) {
            case WINTER: System.out.println("Я люблю зиму.\n"); break;
            case SPRING: System.out.println("Я люблю весну.\n"); break;
            case SUMMER: System.out.println("Я люблю лето.\n"); break;
            case AUTUMN: System.out.println("Я люблю осень.\n"); break;
        }
    }
    public static void main(String[] args) {
        //Времена года, задание 1
        for (Spring spring : Spring.values()) {
            System.out.println(spring);
        }
        //задание 2
        Season season = Season.WINTER;
        finder(season);
        //задания 3-6
        for (Season sea : Season.values()) {
            System.out.println(sea + ", средняя температура: " +
                    sea.getTemp() + " градусов, " + sea.getDescription());
        }
    }
}
