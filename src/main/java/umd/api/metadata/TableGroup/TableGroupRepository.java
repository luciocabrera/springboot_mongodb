package umd.api.metadata.TableGroup;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableGroupRepository extends MongoRepository<TableGroup, String> {
}
