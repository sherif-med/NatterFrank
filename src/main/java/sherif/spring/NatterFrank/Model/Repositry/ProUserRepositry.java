package sherif.spring.NatterFrank.Model.Repositry;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import sherif.spring.NatterFrank.Model.ProUser;

public interface ProUserRepositry extends MongoRepository<ProUser, ObjectId> {
    ProUser findBy_id(ObjectId _id);
}
