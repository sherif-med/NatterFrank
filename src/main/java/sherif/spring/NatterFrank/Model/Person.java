package sherif.spring.NatterFrank.Model;

public class Person {
    private String Username;
    private String Password;

    public Person() {
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Person(String username, String password) {
        Username = username;
        Password = password;
    }
}
