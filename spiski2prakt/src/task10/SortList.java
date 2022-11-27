package task10;

public class SortList {
    private Node head = null;
    private Node tail = null;

    private boolean isEmpty() {
        return head == null;
    }
    public void addNext(String data) {
        Node temp = new Node(data);
        if(isEmpty()) {
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
    }
    public void sorting() {
        Node temp = head;
        Node n;
        String helper;
        int s;
        if (head == null) {
            return;
        }
        while (temp != null) {
            n = temp.next;
            while (n != null) {
                s = temp.data.length();
                if (s > n.data.length())
                    s = n.data.length();
                int i = 0;
                while(i < s) {
                    if (temp.data.charAt(i) > n.data.charAt(i)) {
                        helper = temp.data;
                        temp.data = n.data;
                        n.data = helper;
                        break;
                    }
                    if (temp.data.charAt(i) < n.data.charAt(i)) {
                        break;
                    }
                    if (temp.data.charAt(i) == n.data.charAt(i)) {
                        i++;
                    }
                }
                n = n.next;
            }
            temp = temp.next;
        }
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
