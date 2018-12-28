package sherif.spring.NatterFrank.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document
public class Jobs {
    @Id
    private ObjectId _id;
    private String jobName;
    private String location;
    private float locLong;
    private float locLat;
    private String[] tags;
    private String[] skillsRequired;
    private String description;
    private Date postedSince;
    private String contract;
    private String durationType;
    private float durationValue;
    private float sal;
    private String salPer; //salary per (once,hour,day,Month,Annual)
    private byte status; //activity of the post
    private ObjectId employer;
    private ObjectId[] candidates;

    public Jobs() {
    }

    public Jobs(ObjectId _id, String jobName, String location, float locLong, float locLat, String[] tags, String[] skillsRequired, String description, Date postedSince, String contract, String durationType, float durationValue, float sal, String salPer, byte status, ObjectId employer, ObjectId[] candidates) {
        this._id = _id;
        this.jobName = jobName;
        this.location = location;
        this.locLong = locLong;
        this.locLat = locLat;
        this.tags = tags;
        this.skillsRequired = skillsRequired;
        this.description = description;
        this.postedSince = postedSince;
        this.contract = contract;
        this.durationType = durationType;
        this.durationValue = durationValue;
        this.sal = sal;
        this.salPer = salPer;
        this.status = status;
        this.employer = employer;
        this.candidates = candidates;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getLocLong() {
        return locLong;
    }

    public void setLocLong(float locLong) {
        this.locLong = locLong;
    }

    public float getLocLat() {
        return locLat;
    }

    public void setLocLat(float locLat) {
        this.locLat = locLat;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String[] getSkillsRequired() {
        return skillsRequired;
    }

    public void setSkillsRequired(String[] skillsRequired) {
        this.skillsRequired = skillsRequired;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPostedSince() {
        return postedSince;
    }

    public void setPostedSince(Date postedSince) {
        this.postedSince = postedSince;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getDurationType() {
        return durationType;
    }

    public void setDurationType(String durationType) {
        this.durationType = durationType;
    }

    public float getDurationValue() {
        return durationValue;
    }

    public void setDurationValue(float durationValue) {
        this.durationValue = durationValue;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public String getSalPer() {
        return salPer;
    }

    public void setSalPer(String salPer) {
        this.salPer = salPer;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getEmployer() {
        return employer.toHexString();
    }

    public void setEmployer(ObjectId employer) {
        this.employer = employer;
    }

    public List<String> getCandidates() {
        List<String> hexed = new ArrayList<String>();
        for (ObjectId candidate:candidates) {
            hexed.add(candidate.toHexString());
        }
        return hexed;
    }

    public void setCandidates(ObjectId[] candidates) {
        this.candidates = candidates;
    }
}
