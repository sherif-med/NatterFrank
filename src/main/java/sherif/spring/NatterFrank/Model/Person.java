package sherif.spring.NatterFrank.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Person {
    @Id
    private ObjectId _id;
    private String Username;
    private String Password;

    public Person() {
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
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

    public Person(ObjectId _id,String username, String password) {
        this._id = _id;
        Username = username;
        Password = password;
    }
}
