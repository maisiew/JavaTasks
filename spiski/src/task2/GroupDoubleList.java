package task2;

public class GroupDoubleList {
    private NodeDoubleList head;
    private NodeDoubleList tail;

    public GroupDoubleList() {}

    public void CreateList() {
        head = null;
        tail = null;
        System.out.println("Список создан!");

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void AddToList() {
        NodeDoubleList temp = new NodeDoubleList();
        temp.Reader();
        if(isEmpty()) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            NodeDoubleList cur = tail;
            tail = temp;
            tail.prev = cur;
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
            NodeDoubleList temp = head;
            NodeDoubleList n = head;
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
            temp.prev = n;
        }
    }

    public void ToScreen() {
        NodeDoubleList temp = head;
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
