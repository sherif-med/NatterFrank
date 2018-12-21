package sherif.spring.NatterFrank.Model;

public class Application {

    private String JobId;
    private String CandidateId;
    private String EmployerId;
    private int Status; //taken or waiting ...
    private int opinion; //Satisfied or not ...
    private int ranking; //candidate rank overall in candidates

    public Application() {
    }

    public Application(String jobId, String candidateId, String employerId, int status, int opinion, int ranking) {
        JobId = jobId;
        CandidateId = candidateId;
        EmployerId = employerId;
        Status = status;
        this.opinion = opinion;
        this.ranking = ranking;
    }

    public String getJobId() {
        return JobId;
    }

    public void setJobId(String jobId) {
        JobId = jobId;
    }

    public String getCandidateId() {
        return CandidateId;
    }

    public void setCandidateId(String candidateId) {
        CandidateId = candidateId;
    }

    public String getEmployerId() {
        return EmployerId;
    }

    public void setEmployerId(String employerId) {
        EmployerId = employerId;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
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
