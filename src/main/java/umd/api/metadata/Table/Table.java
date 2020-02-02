package umd.api.metadata.Table;


import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import umd.api.metadata.UserRole.UserRole;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Document(collection = "tables")
public class Table {

    @Id
    private ObjectId id;
    @NotNull(message = "The Table Group Id cannot be null")
    private ObjectId tablegroup_id;
    @Indexed(name = "table_name_index", unique = true, direction = IndexDirection.ASCENDING)
    @NotBlank(message = "The Table name cannot be empty")
    private String name;
    private String description;

    private Date createdAt;
    private String createdBy;
    private Date lastModifiedAt;
    private String lastModifiedBy;

    private Iterable<UserRole> userRole;
}
