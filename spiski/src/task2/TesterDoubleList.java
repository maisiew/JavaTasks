package task2;

public class TesterDoubleList {
    public static void main(String[] args) {
        GroupDoubleList g = new GroupDoubleList();
        g.CreateList();
        if (g.isEmpty())
            System.out.println("Список пустой");
        else
            System.out.println("Список не пустой");
        g.AddToList();
        g.AddToList();
        g.AddToList();
        g.ToScreen();
        if (g.isEmpty())
            System.out.println("Список пустой");
        else
            System.out.println("Список не пустой");
        g.RemoveFromList(0);
        g.ToScreen();
        g.DeleteAll();
        if (g.isEmpty())
            System.out.println("Список пустой");
        else
            System.out.println("Список не пустой");
    }
}
