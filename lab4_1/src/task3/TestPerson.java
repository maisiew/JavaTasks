package task3;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person(18,"Maisie");
        person1.PersonMove();
        person2.PersonMove();
        person1.PersonTalk();
        person2.PersonTalk();
    }
}
