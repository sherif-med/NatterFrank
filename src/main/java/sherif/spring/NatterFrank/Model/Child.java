package sherif.spring.NatterFrank.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Child {
    @Id
    private ObjectId _id;
    private String userId;
    private String level;

    public Child() {
    }

    public Child(ObjectId _id, String userId, String level) {
        this._id = _id;
        this.userId = userId;
        this.level = level;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        level = level;
    }
}
