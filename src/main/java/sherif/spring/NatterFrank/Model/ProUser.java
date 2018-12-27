package sherif.spring.NatterFrank.Model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class ProUser extends MemberUser{

    private Child[] children;
    private Date StartDate;
    private Date EndDate;

    public ProUser() {
    }

    public ProUser(ObjectId _id,String username, String password, String firstName, String lastName, Date birthDate, int age, String email, String nickname, String bio, byte gender, String phoneNumber, String occupation, String[] skills, Date memberSince, String organization, String country, String gouvernerat, int zipCode, String aderess, float adrLong, float adrLat, String[] postOccupations, float trustScore, String resume, Child[] children, Date startDate, Date endDate) {
        super(_id,username, password, firstName, lastName, birthDate, age, email, nickname, bio, gender, phoneNumber, occupation, skills, memberSince, organization, country, gouvernerat, zipCode, aderess, adrLong, adrLat, postOccupations, trustScore, resume);
        this.children = children;
        StartDate = startDate;
        EndDate = endDate;
    }

    public Child[] getChildren() {
        return children;
    }

    public void setChildren(Child[] children) {
        this.children = children;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }
}
