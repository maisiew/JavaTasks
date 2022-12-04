package task3;

import java.util.Scanner;

public class NodeCircleList {
    public NodeCircleList next;
    private int age;
    private String name;
    private String group;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public NodeCircleList() { }

    public Object[] Reader() {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Введите имя студента: ");
        if (sc.hasNextLine()) {
            this.name = sc.nextLine();
        }
        System.out.println("Введите возраст студента: ");
        if (sc.hasNextInt()) {
            this.age = sc.nextInt();
        }
        System.out.println("Введите группу студента: ");
        if (sc.hasNextLine()) {
            this.group = s.nextLine();
        }
        Object k[] ={name, age, group};
        return k;
    }
    public String Writer() {
        String st = "Имя: " + name + ", возраст: " + age + ", группа: " + group;
        return st;
    }
}
