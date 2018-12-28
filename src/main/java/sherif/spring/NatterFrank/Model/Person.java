package sherif.spring.NatterFrank.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Person {
    @Id
    private ObjectId _id;
    private String username;
    private String password;

    public Person() {
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(ObjectId _id,String username, String password) {
        this._id = _id;
        this.username = username;
        this.password = password;
    }
}
