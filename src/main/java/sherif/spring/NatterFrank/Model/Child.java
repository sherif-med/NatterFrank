package sherif.spring.NatterFrank.Model;

public class Child {
    private String UserId;
    private String Level;

    public Child() {
    }

    public Child(String userId, String level) {
        UserId = userId;
        Level = level;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }
}
