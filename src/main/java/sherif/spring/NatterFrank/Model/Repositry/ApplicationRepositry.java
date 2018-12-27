package sherif.spring.NatterFrank.Model.Repositry;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import sherif.spring.NatterFrank.Model.Application;

import java.util.List;

public interface ApplicationRepositry extends MongoRepository<Application, ObjectId> {
    Application findBy_id(ObjectId _id);
    List<Application> findApplicationByJobId(ObjectId _id);
    List<Application> findApplicationByCandidateId(ObjectId _Id);
    List<Application> findApplicationByEmployerId(ObjectId _Id);
}
