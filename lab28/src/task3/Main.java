package task3;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Hashtable<Double, Object> a = new Hashtable<>();
        Random r = new Random();
        Object k = "a";
        for (int i = 0; i < 10; i++) {
            a.put(r.nextDouble(), k);
            k += "ba";
        }
        for (Iterator<Double> it = a.keySet().iterator(); it.hasNext();) {
            Double key = it.next();
            System.out.println(key + ": " + a.get(key));
        }
    }
}
