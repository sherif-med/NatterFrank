package sherif.spring.NatterFrank.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class MemberUser extends Person{
    private String FirstName;
    private String LastName;
    private Date BirthDate;
    private int Age;
    private String Email;
    private String Nickname;
    private String Bio;
    private byte Gender;
    private String PhoneNumber;
    private String Occupation;
    private String[] Skills;
    private Date MemberSince;
    private String Organization;
    private String Country;
    private String Gouvernerat;
    private int ZipCode;
    private String Aderess;
    private float AdrLong;
    private float AdrLat;
    private String[] PostOccupations;
    private float TrustScore;
    private String Resume;

    public MemberUser() {
    }

    public MemberUser(String username, String password) {
        super(username, password);
    }

    public MemberUser(String username, String password, String firstName, String lastName, Date birthDate, int age, String email, String nickname, String bio, byte gender, String phoneNumber, String occupation, String[] skills, Date memberSince, String organization, String country, String gouvernerat, int zipCode, String aderess, float adrLong, float adrLat, String[] postOccupations, float trustScore, String resume) {
        super(username, password);
        FirstName = firstName;
        LastName = lastName;
        BirthDate = birthDate;
        Age = age;
        Email = email;
        Nickname = nickname;
        Bio = bio;
        Gender = gender;
        PhoneNumber = phoneNumber;
        Occupation = occupation;
        Skills = skills;
        MemberSince = memberSince;
        Organization = organization;
        Country = country;
        Gouvernerat = gouvernerat;
        ZipCode = zipCode;
        Aderess = aderess;
        AdrLong = adrLong;
        AdrLat = adrLat;
        PostOccupations = postOccupations;
        TrustScore = trustScore;
        Resume = resume;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public byte getGender() {
        return Gender;
    }

    public void setGender(byte gender) {
        Gender = gender;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public String[] getSkills() {
        return Skills;
    }

    public void setSkills(String[] skills) {
        Skills = skills;
    }

    public Date getMemberSince() {
        return MemberSince;
    }

    public void setMemberSince(Date memberSince) {
        MemberSince = memberSince;
    }

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String organization) {
        Organization = organization;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getGouvernerat() {
        return Gouvernerat;
    }

    public void setGouvernerat(String gouvernerat) {
        Gouvernerat = gouvernerat;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int zipCode) {
        ZipCode = zipCode;
    }

    public String getAderess() {
        return Aderess;
    }

    public void setAderess(String aderess) {
        Aderess = aderess;
    }

    public float getAdrLong() {
        return AdrLong;
    }

    public void setAdrLong(float adrLong) {
        AdrLong = adrLong;
    }

    public float getAdrLat() {
        return AdrLat;
    }

    public void setAdrLat(float adrLat) {
        AdrLat = adrLat;
    }

    public String[] getPostOccupations() {
        return PostOccupations;
    }

    public void setPostOccupations(String[] postOccupations) {
        PostOccupations = postOccupations;
    }

    public float getTrustScore() {
        return TrustScore;
    }

    public void setTrustScore(float trustScore) {
        TrustScore = trustScore;
    }

    public String getResume() {
        return Resume;
    }

    public void setResume(String resume) {
        Resume = resume;
    }
}
