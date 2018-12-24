package sherif.spring.NatterFrank.Model.Repositry;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import sherif.spring.NatterFrank.Model.MemberUser;

public interface MemberUserRepositry extends MongoRepository<MemberUser, ObjectId> {
}
