package task1;
import java.util.*;

public class Buys {
    public static boolean checkInn(int inn, int[] data) throws InnNotValidException {
        int i = 0;
        while (inn != data[i]) {
            i++;
            if(i > 3) throw new InnNotValidException(inn);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] data = new int[4];
        int j = 111111;
        for (int i = 0; i < 4; i++) {
            data[i] = j;
            j += 333333;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер ИНН: ");
        try {
            int inn = sc.nextInt();
            checkInn(inn, data);
        } catch (InnNotValidException e) {
            System.err.println(e.getLocalizedMessage());
            System.exit(0);
        }
        System.out.println("ИНН действителен!");
    }
}
