package umd.api.metadata.TableGroup;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import umd.api.metadata.UserRole.UserRole;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Getter
@Setter
@ToString
@Document(collection = "tablegroups")
public class TableGroup {

    @Id
    private ObjectId id;
    @Indexed(name = "table_group_name_index", unique = true, direction = IndexDirection.ASCENDING)
    @NotBlank(message = "The Table Group Name cannot be empty")
    private String name;
    @NotBlank(message = "The Table Group Description cannot be empty")
    private String description;

    private Date createdAt;
    private String createdBy;
    private Date lastModifiedAt;
    private String lastModifiedBy;

    private Iterable<UserRole> userRole;
}
