package sherif.spring.NatterFrank.Model.Repositry;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import sherif.spring.NatterFrank.Model.Person;

public interface PersonRepositry extends MongoRepository <Person, ObjectId> {
    Person findBy_id(ObjectId _id);
}
