package task3;

public class TesterCircleList {
    public static void main(String[] args) {
        GroupCircleList g = new GroupCircleList();
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
