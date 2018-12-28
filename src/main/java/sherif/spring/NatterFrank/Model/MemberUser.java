package sherif.spring.NatterFrank.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mongodb.lang.Nullable;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document
public class MemberUser extends Person{
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int age;
    private String email;
    private String nickname;
    private String bio;
    private byte gender;
    private String phoneNumber;
    private String occupation;
    private String[] skills;
    private Date memberSince;
    private String organization;
    private String country;
    private String gouvernerat;
    private int zipCode;
    private String aderess;
    private float adrLong;
    private float adrLat;
    private ObjectId[] postOccupations;
    private float trustScore;
    private String resume;

    public MemberUser() {
    }

    public MemberUser(ObjectId _id, String username, String password) {
        super(_id, username, password);
    }

    public MemberUser(ObjectId _id, String username, String password, String firstName, String lastName, Date birthDate, int age, String email, String nickname, String bio, byte gender, String phoneNumber, String occupation, String[] skills, Date memberSince, String organization, String country, String gouvernerat, int zipCode, String aderess, float adrLong, float adrLat, ObjectId[] postOccupations, float trustScore, String resume) {
        super(_id, username, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.age = age;
        this.email = email;
        this.nickname = nickname;
        this.bio = bio;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.occupation = occupation;
        this.skills = skills;
        this.memberSince = memberSince;
        this.organization = organization;
        this.country = country;
        this.gouvernerat = gouvernerat;
        this.zipCode = zipCode;
        this.aderess = aderess;
        this.adrLong = adrLong;
        this.adrLat = adrLat;
        this.postOccupations = postOccupations;
        this.trustScore = trustScore;
        this.resume = resume;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public Date getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(Date memberSince) {
        this.memberSince = memberSince;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGouvernerat() {
        return gouvernerat;
    }

    public void setGouvernerat(String gouvernerat) {
        this.gouvernerat = gouvernerat;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getAderess() {
        return aderess;
    }

    public void setAderess(String aderess) {
        this.aderess = aderess;
    }

    public float getAdrLong() {
        return adrLong;
    }

    public void setAdrLong(float adrLong) {
        this.adrLong = adrLong;
    }

    public float getAdrLat() {
        return adrLat;
    }

    public void setAdrLat(float adrLat) {
        this.adrLat = adrLat;
    }


    @JsonIgnore
    public List<String> getPostOccupations() {
        List<String> hexed = new ArrayList<String>();
        for (ObjectId occ:postOccupations) {
            hexed.add(occ.toHexString());
        }
        return hexed;
    }

    public void setPostOccupations(ObjectId[] postOccupations) {
        this.postOccupations = postOccupations;
    }

    public float getTrustScore() {
        return trustScore;
    }

    public void setTrustScore(float trustScore) {
        this.trustScore = trustScore;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
