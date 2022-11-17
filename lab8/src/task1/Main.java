package task1;

public class Main {
        public static String recursion(int n) {
            if (n == 1)
                return "1";
            String a = "";
            for (int i = 1; i <= n; i++) {
                a += n;
            }
            return recursion(n - 1) + a;
        }

        public static void main(String[] args) {
            System.out.println(recursion(5));
        }
}
