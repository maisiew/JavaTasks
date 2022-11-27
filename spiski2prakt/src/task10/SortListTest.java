package task10;

public class SortListTest {
    public static void main(String[] args) {
        SortList list = new SortList();
        list.addNext("maer");
        list.addNext("laith");
        list.addNext("gymraeg");
        list.addNext("yn");
        list.addNext("hardd");
        list.addNext("iawn");
        list.print();
        list.sorting();
        list.print();
    }
}
