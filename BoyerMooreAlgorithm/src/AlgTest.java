import java.util.*;

public class AlgTest {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sl = s.length();
        if (sl == 0) {
            System.out.println("Ошибка");
            System.exit(0);
        }
        System.out.println("Введите подстроку, которую нужно найти в строке: ");
        String pattern = sc.nextLine();
        int p = pattern.length();
        if (p == 0 || p > sl) {
            System.out.println("Ошибка");
            System.exit(0);
        }
        System.out.println("Вы ввели: \nСтрока: '" + s + "' \nПодстрока: '" + pattern + "'");
        int temp = 0;
        char dic[] = new char[p];
        int count = 0;
        String line = "-----------------------------------------------------";
        while (temp < p) {
            char c = pattern.charAt(temp);
            dic[temp] = c;
            temp++;
        }
        int i = p - 1;
        while (i < sl) {
            int k = p - 1;
            int d = i;
            while (k >= 0 && pattern.charAt(k) == s.charAt(d)) {
                k--;
                d--;
            }
            if (k < 0) {
                System.out.println(line + "\nПодстрока '" + pattern + "' найдена!\nПервый символ подстроки находится в строке на позиции '" + (d + 1) + "' (считая от 0)");
                i += p;
                count++;
            }
            if (k >= 0) {
                for (int helper = k; helper >= -1; helper--) {
                    if (helper == -1) {
                        i += p;
                        break;
                    }
                    if (helper != -1 && dic[helper] == s.charAt(d)) {
                        i = i + (p - helper - 1);
                        break;
                    }
                }
            }
        }
        if(count > 0) {
            String r = "раз";
            if((count < 10 || count > 20) && count % 10 > 1 && count % 10 < 5)
                r += 'а';
            System.out.println(line + "\nПодстрока '" + pattern + "' встречается " + count + " " + r +"!");
        }
        else
            System.out.println(line + "\nПодстрока '" + pattern + "' не встречается :(");
    }
}
