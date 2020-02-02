package umd.api.metadata.Role;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;

public class Role {
    @Id
    private ObjectId id;
    @Indexed(name = "role_name_index", unique = true, direction = IndexDirection.ASCENDING)
    private String name;

    private Date createdAt;
    private String createdBy;
    private Date lastModifiedAt;
    private String lastModifiedBy;
}
