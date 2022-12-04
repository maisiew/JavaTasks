import java.util.Stack;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public void insert(int value) { //вставка элемента
        Node n = new Node();
        n.setValue(value);
        if (root == null) { //если дерево пустое
            root = n;
        }
        else {
            Node temp = root;
            Node parent;
            while (true) {
                parent = temp;
                if(value == temp.getValue()) {   //если элемент уже есть
                }
                else  if (value < temp.getValue()) {   //значение меньше текущего узла
                    temp = temp.getLeft();
                    if (temp == null){
                        parent.setLeft(n); //вставить влево
                        return;
                    }
                }
                else { //значение больше текущего узла
                    temp = temp.getRight();
                    if (temp == null) {
                        parent.setRight(n);  //вставить вправо
                        return;
                    }
                }
            }
        }
    }

    public void deleteNode(int value) { // Удаление узла
        Node temp = root;
        Node parent = root;
        boolean isLeft = true;
        while (temp.getValue() != value) {
            parent = temp;
            if (value < temp.getValue()) { //Значение меньше узла
                isLeft = true;
                temp = temp.getLeft();
            }
            else { //Значение больше узла
                isLeft = false;
                temp = temp.getRight();
            }
        }

        if (temp.getLeft() == null && temp.getRight() == null) {
            if (temp == root)
                root = null;
            else if (isLeft)
                parent.setLeft(null);
            else
                parent.setRight(null);
        }
        else if (temp.getRight() == null) { //правого потомка нет
            if (temp == root)
                root = temp.getLeft();
            else if (isLeft)
                parent.setLeft(temp.getLeft());
            else
                parent.setRight(temp.getLeft());
        }
        else if (temp.getLeft() == null) { //левого потомка нет
            if (temp == root)
                root = temp.getRight();
            else if (isLeft)
                parent.setLeft(temp.getRight());
            else
                parent.setRight(temp.getRight());
        }
        else { //есть оба потомка
            Node heir = receiveRight(temp);
            Node hL = temp.getLeft();
            heir.setLeft(hL);
            if (temp == root)
                root = heir;
            else if (isLeft)
                parent.setLeft(heir);
            else
                parent.setRight(heir);
        }
    }

    private Node receiveRight(Node node) {
        Node parent = node;
        Node heir = node;
        Node temp = node.getRight(); // Переход к правому потомку
        while (temp != null) //Ищем последнего левого потомка
        {
            parent = heir;
            heir = temp;
            temp = temp.getLeft();
        }
        if (heir != node.getRight())
        {
            parent.setLeft(heir.getRight());
            heir.setRight(node.getRight());
        }
        return heir;
    }
    public void clear() {
        int val = root.getValue();
        Node temp = root;
        while(temp.getLeft() != null) {
            int vLeft = temp.getLeft().getValue();
            deleteNode(vLeft);
        }
        while(temp.getRight() != null) {
            int vRight = temp.getRight().getValue();
            deleteNode(vRight);
        }
        deleteNode(val);
        System.out.println("Дерево очищено!");
    }
    public void printTree() {
        Stack general = new Stack(); // общий стек для значений дерева
        general.push(root);
        int t = 32;
        boolean isRowEmpty = false;
        while (isRowEmpty == false) {
            Stack local = new Stack(); // локальный стек для потомков элемента
            isRowEmpty = true;

            for (int j = 0; j < t; j++)
                System.out.print(" ");
            while (general.isEmpty() == false) {
                Node temp = (Node) general.pop();
                if (temp != null) {
                    System.out.print(temp.getValue());
                    local.push(temp.getLeft());
                    local.push(temp.getRight());
                    if (temp.getLeft() != null || temp.getRight() != null)
                        isRowEmpty = false;
                }
                else {
                    System.out.print(" ");
                    local.push(null);
                    local.push(null);
                }
                for (int j = 0; j < t * 2 - 1; j++)
                    System.out.print(" ");
            }
            System.out.println();
            t = t / 2;
            while (local.isEmpty() == false)
                general.push(local.pop());
        }
    }
}
