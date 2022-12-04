package task2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Main {
public static class Node implements Comparable<Node> {
    private Character ch;
    private int weight;
    private Node left;
    private Node right;

    public Node(Character ch, int weight) {
        this.ch = ch;
        this.weight = weight;
    }

    public Node(Character ch, int weight, Node left, Node right) {
        this.ch = ch;
        this.weight = weight;
        this.left = left;
        this.right = right;
    }

    public int compareTo(Node o) {
        return o.weight - weight;
    }
    public String getCode(Character c, String s) {
        if(ch == c) {
            return s;
        }
        else {
            if(left != null) {
                String path = left.getCode(c, s + 0);
                if(path != null) {
                    return path;
                }
            }
            if(right != null) {
                String path = right.getCode(c, s + 1);
                if(path != null) {
                    return path;
                }
            }
        }
        return null;
    }
}

    public static Node huffman(ArrayList<Node> n) {
        while (n.size() > 1) {
            Collections.sort(n);
            Node left = n.remove(n.size() - 1);
            Node right = n.remove(n.size() - 1);
            Node temp = new Node(null, right.weight + left.weight, left, right);
            n.add(temp);
        }
        return n.get(0);
    }
    private static TreeMap<Character, Integer> counter(String t) {
        TreeMap<Character, Integer> m = new TreeMap<>();
        for(int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            Integer count = m.get(c);
            m.put(c, count != null ? count + 1 : 1);
        }
        System.out.println("Символы и их частота в строке: " + m);
        return m;
    }
    public static void main(String[] args) {
        String text = "Per aspera ad astra";
        System.out.println("Исходная строка: " + text);
        TreeMap<Character, Integer> m = counter(text);
        ArrayList<Node> n = new ArrayList<>();
        for(Character c: m.keySet()) {
            n.add(new Node(c, m.get(c)));
        }
        Node tree = huffman(n);
        TreeMap<Character, String> codes = new TreeMap<>();
        for(Character c: m.keySet()) {
            codes.put(c, tree.getCode(c, ""));
        }
        System.out.println("Коды символов строки: " + codes.toString());
        StringBuilder helper = new StringBuilder();
        for(int i = 0; i < text.length(); i++) {
            helper.append(codes.get(text.charAt(i)));
        }
        System.out.println("Закодированная строка: " + helper);
    }
}
