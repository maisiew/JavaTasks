package task1_2_3;
import java.util.*;
import java.util.regex.*;

public class Main {
    public static boolean equ(String st){
        return st.equals("abcdefghijklmnopqrstuv18340");
    }

    public static void finder(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
    }

    public static void main(String[] args) {
        String toParse;
        System.out.println("Введите строку: ");
        toParse = new Scanner(System.in).nextLine();
        String del;
        System.out.println("Введите разделитель: ");
        del = new Scanner(System.in).nextLine();
        String list[] = new String[toParse.length()];
        StringTokenizer st = new StringTokenizer(toParse,del);
        int i = 0;
        while(st.hasMoreTokens()){
            list[i] = st.nextToken();
            System.out.println(list[i]);
            i++;
        }

        String str1 = "abcdefghijklmnopqrstuv18340";
        String str2 = "Divide et impera";
        System.out.println(equ(str1));
        System.out.println(equ(str2));
        finder("13 EUR, 44 ERR, 0.004 EU, 14.88 RUB, abcd 284r42qr9 гыгы");
    }
}
