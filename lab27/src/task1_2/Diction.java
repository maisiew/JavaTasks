package task1_2;
import java.util.*;

public class Diction {
    private Hashtable dic;

    public void hashtabHash() {
        Hashtable<String, String> dic;
    }


    public Diction() { }

    public Hashtable hashtabInit() {
        dic = new Hashtable<>();
        return dic;
    }
    public void hashtabAdd(String key, String val) {
        dic.put(key, val);
    }
    public Object hashtabLookup(String key) {
        Object rez;
        if(dic.containsKey(key))
            rez = "Объект с ключом '" + key + "' - '" + dic.get(key) + "'";
        else
            rez = "Объект не найден";
        return rez;
    }
    public Hashtable hashtabDelete(String key) {
        System.out.println("Удаление объекта '" + dic.get(key) + "'");
        dic.remove(key);
        System.out.println();
        print();
        return dic;
    }
    public void print() {
        System.out.println("Словарь: ");
        for (Iterator<String> it = dic.keySet().iterator(); it.hasNext();) {
            String key = it.next();
            System.out.println(key + ": " + dic.get(key));
        }
    }
}
