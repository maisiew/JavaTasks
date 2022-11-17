package task3;

public class Person {
    private int age;
    private String fullName;

    public Person() { }
    public void PersonTalk(){
        System.out.println("Такой-то " + fullName + " говорит");
    }
    public void PersonMove(){
        System.out.println("Такой-то " + fullName + " говорит");;
    }
    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }
}
