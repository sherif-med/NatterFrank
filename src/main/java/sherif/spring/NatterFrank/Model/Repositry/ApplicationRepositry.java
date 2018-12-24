package sherif.spring.NatterFrank.Model.Repositry;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import sherif.spring.NatterFrank.Model.Application;

public interface ApplicationRepositry extends MongoRepository<Application, ObjectId> {
}
