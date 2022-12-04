package task3;

public class GroupCircleList {
    private NodeCircleList head;
    private NodeCircleList tail;

    public GroupCircleList() {}

    public void CreateList() {
        head = null;
        tail = null;
        System.out.println("Список создан!");

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void AddToList() {
        NodeCircleList temp = new NodeCircleList();
        temp.Reader();
        if(isEmpty()) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
        tail.next = head;
        System.out.println("В список добавлен узел: {" + temp.Writer() + "}");
    }

    public void RemoveFromList(int k) {
        if (isEmpty())
            System.out.println("Список пуст, ничего удалить нельзя");
        else if(k == 0) {
            System.out.println("Удаление из списка узла: {" + head.Writer() + "}");
            head = head.next;
            tail.next = head;
        }
        else {
            int d = 0;
            NodeCircleList temp = head;
            NodeCircleList n = head;
            while(d < k) {
                if(temp == head && d > 0) {
                    System.out.println("Индекс за границей списка");
                    break;
                }
                n = temp;
                temp = temp.next;
                d++;
            }
            System.out.println("Удаление из списка узла: {" + temp.Writer() + "}");
            if(temp == tail) {
                n.next = head;
            }
            else {
                temp = temp.next;
                n.next = temp;
            }
        }
    }

    public void ToScreen() {
        NodeCircleList temp = head;
        System.out.println("Список:");
        System.out.println(temp.Writer());
        temp = temp.next;
        while (temp != head) {
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
