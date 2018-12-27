package sherif.spring.NatterFrank.Model;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Application {
    @Id
    private ObjectId _id;
    private ObjectId jobId ;
    private ObjectId candidateId;
    private ObjectId employerId ;
    private int status; //taken or waiting ...
    private int opinion; //Satisfied or not ...
    private int ranking; //candidate rank overall in candidates

    public Application() {
    }

    public Application(ObjectId _id,ObjectId jobId, ObjectId candidateId, ObjectId employerId, int status, int opinion, int ranking) {
        this._id=_id;
        this.jobId = jobId;
        this.candidateId = candidateId;
        this.employerId = employerId;
        this.status = status;
        this.opinion = opinion;
        this.ranking = ranking;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getJobId() {
        return jobId.toHexString();
    }

    public void setJobId(ObjectId jobId) {
        this.jobId = jobId;
    }

    public String getCandidateId() {
        return candidateId.toHexString();
    }

    public void setCandidateId(ObjectId candidateId) {
        this.candidateId = candidateId;
    }

    public String getEmployerId() {
        return employerId.toHexString();
    }

    public void setEmployerId(ObjectId employerId) {
        this.employerId = employerId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getOpinion() {
        return opinion;
    }

    public void setOpinion(int opinion) {
        this.opinion = opinion;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
