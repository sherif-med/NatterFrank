package sherif.spring.NatterFrank.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Jobs {
    private String JobName;
    private String Location;
    private float LocLong;
    private float LocLat;
    private String[] Tags;
    private String[] SkillsRequired;
    private String Description;
    private Date PostedSince;
    private String Contract;
    private String DurationType;
    private float DurationValue;
    private float Sal;
    private String SalPer; //salary per (once,hour,day,Month,Annual)
    private byte Status; //activity of the post
    private String Employer;
    private String[] Candidates;

    public Jobs() {
    }

    public Jobs(String jobName, String location, float locLong, float locLat, String[] tags, String[] skillsRequired, String description, Date postedSince, String contract, String durationType, float durationValue, float sal, String salPer, byte status, String employer, String[] candidates) {
        JobName = jobName;
        Location = location;
        LocLong = locLong;
        LocLat = locLat;
        Tags = tags;
        SkillsRequired = skillsRequired;
        Description = description;
        PostedSince = postedSince;
        Contract = contract;
        DurationType = durationType;
        DurationValue = durationValue;
        Sal = sal;
        SalPer = salPer;
        Status = status;
        Employer = employer;
        Candidates = candidates;
    }

    public String getJobName() {
        return JobName;
    }

    public void setJobName(String jobName) {
        JobName = jobName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public float getLocLong() {
        return LocLong;
    }

    public void setLocLong(float locLong) {
        LocLong = locLong;
    }

    public float getLocLat() {
        return LocLat;
    }

    public void setLocLat(float locLat) {
        LocLat = locLat;
    }

    public String[] getTags() {
        return Tags;
    }

    public void setTags(String[] tags) {
        Tags = tags;
    }

    public String[] getSkillsRequired() {
        return SkillsRequired;
    }

    public void setSkillsRequired(String[] skillsRequired) {
        SkillsRequired = skillsRequired;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getPostedSince() {
        return PostedSince;
    }

    public void setPostedSince(Date postedSince) {
        PostedSince = postedSince;
    }

    public String getContract() {
        return Contract;
    }

    public void setContract(String contract) {
        Contract = contract;
    }

    public String getDurationType() {
        return DurationType;
    }

    public void setDurationType(String durationType) {
        DurationType = durationType;
    }

    public float getDurationValue() {
        return DurationValue;
    }

    public void setDurationValue(float durationValue) {
        DurationValue = durationValue;
    }

    public float getSal() {
        return Sal;
    }

    public void setSal(float sal) {
        Sal = sal;
    }

    public String getSalPer() {
        return SalPer;
    }

    public void setSalPer(String salPer) {
        SalPer = salPer;
    }

    public byte getStatus() {
        return Status;
    }

    public void setStatus(byte status) {
        Status = status;
    }

    public String getEmployer() {
        return Employer;
    }

    public void setEmployer(String employer) {
        Employer = employer;
    }

    public String[] getCandidates() {
        return Candidates;
    }

    public void setCandidates(String[] candidates) {
        Candidates = candidates;
    }


}
