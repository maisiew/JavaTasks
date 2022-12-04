import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество городов: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N <= 1) {
            System.out.println("Ладно...");
            System.exit(0);
        }
        int[][] g = new int[N][N];
        System.out.println("В следующих " + N + " строках через пробел введите по N чисел, каждое из которых является единичкой или ноликом: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                g[i][j] = scanner.nextInt();
                if (g[i][j] != 0 && g[i][j] != 1 || (i == j && g[i][j] == 1)) {
                    System.out.println("Ошибка ввода");
                    System.exit(0);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (g[i][j] == 1) {
                    if (g[j][i] == 1) {
                        count++;
                    } else {
                        System.out.println("Ошибка ввода");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("Количество дорог: " + count / 2);
    }
}
