package task1_2;

public class Test {
    public static void main(String[] args) {
        Diction dic = new Diction();
        dic.hashtabHash();
        dic.hashtabInit();
        dic.hashtabAdd("Шут", "безрассудство");
        dic.hashtabAdd("Маг", "большие возможности");
        dic.hashtabAdd("Верховная жрица", "сильная интуиция");
        dic.hashtabAdd("Императрица", "счастье в личной жизни");
        dic.hashtabAdd("Император", "покровитель");
        dic.hashtabAdd("Иерофант", "обучение");
        dic.hashtabAdd("Влюбленные", "правильный выбор");
        dic.hashtabAdd("Колесница", "перемены");
        dic.hashtabAdd("Сила", "исцеление");
        dic.hashtabAdd("Отшельник", "благоразумие");
        dic.print();
        System.out.println();
        System.out.println(dic.hashtabLookup("Маг"));
        System.out.println();
        dic.hashtabDelete("Отшельник");

    }
}
