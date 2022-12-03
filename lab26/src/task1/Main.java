package task1;
import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static Stack rev(Stack st) {
        Object lVal = st.pop();
        Iterator iterator = st.iterator();
        Object fVal = iterator.next();
        Iterator it = st.iterator();
        Object temp = it.next();
        Stack h = new Stack();
        Stack helper = new Stack();
        helper.push(lVal);
        for (int i = 1; i < st.size(); i++) {
            temp = it.next();
            h.push(temp);
            helper.push(temp);
        }
        helper.push(fVal);
        return helper;
    }
    public static Stack revers(Stack st) {
            Stack helper = rev(st);
            System.out.println(helper);
            int k = 1;
            Iterator iterator;
            while(k < helper.size()/2) {
                iterator = helper.iterator();
                Stack hLast = new Stack();
                Stack hFirst = new Stack();
                int d = helper.size() - k;
                int g = 0;
                Iterator itm = helper.iterator();
                Object sl;
                while(g < d) {
                    sl = itm.next();
                    g++;
                }
                for(int i = 0; i < k; i++) {
                    sl = itm.next();
                    hLast.push(sl);
                    Object sf = iterator.next();
                    hFirst.push(sf);
                }
                Stack m = new Stack();
                for(int i = k; i < helper.size() - k; i++) {
                    Object sf = iterator.next();
                    m.push(sf);
                }
                m = rev(m);
                Iterator it1 = m.iterator();
                while(it1.hasNext()) {
                    hFirst.push(it1.next());
                }
                Iterator it2 = hLast.iterator();
                while(it2.hasNext()) {
                    hFirst.push(it2.next());
                }
                helper = hFirst;
                System.out.println(helper);
                k++;
            }
        return helper;
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        for (int i = 0; i < 11; i++)
            st.push(i);
        System.out.println(st);
        revers(st);
    }
}
