package task1;

public class GroupList {
    private NodeList head;
    private NodeList tail;

    public GroupList() {
    }

    public void CreateList() {
        head = null;
        tail = null;
        System.out.println("Список создан!");

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void AddToList() {
        NodeList temp = new NodeList();
        temp.Reader();
        if (isEmpty()) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        System.out.println("В список добавлен узел: {" + temp.Writer() + "}");
    }

    public void RemoveFromList(int k) {
        if (isEmpty())
            System.out.println("Список пуст, ничего удалить нельзя");
        else if(k == 0) {
            System.out.println("Удаление из списка узла: {" + head.Writer() + "}");
            head = head.next;
        }
        else {
            int d = 0;
            NodeList temp = head;
            NodeList n = head;
            while(d < k) {
                if(temp == null) {
                    System.out.println("Индекс за границей списка");
                    break;
                }
                n = temp;
                temp = temp.next;
                d++;
            }
            System.out.println("Удаление из списка узла: {" + temp.Writer() + "}");
            temp = temp.next;
            n.next = temp;
        }
    }

    public void ToScreen() {
        NodeList temp = head;
        System.out.println("Список:");
        while (temp != null) {
            System.out.println(temp.Writer());
            temp = temp.next;
        }
        System.out.println();
    }

    public void DeleteAll() {
        head = null;
        System.out.println("Список очищен");
    }
}
