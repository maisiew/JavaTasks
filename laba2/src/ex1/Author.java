package ex1;

public class Author {
    private String name, Email;
    private char Gender;
    public Author(String name, String Email, char Gender) {
        this.name = name;
        this.Email = Email;
        this.Gender = Gender;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public char getGender() {
        return Gender;
    }
    public String toString() {
        String res = "Author{" +
                "name='" + name +'\'' +
                ", Email='" + Email + '\'' +
                ", Gender='" + Gender + '\'' + '}';
        return res;
    }
}
