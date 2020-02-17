package umd.api.metadata.TableGroup;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import umd.api.metadata.UserRole.UserRole;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Date;

@Getter
@Setter
@ToString
@Document(collection = "table_groups")
public class TableGroup {

    @Id
    private String _id;

    @Indexed(name = "table_group_name_index", unique = true, direction = IndexDirection.ASCENDING)
    @NotBlank(message = "The Table Group name cannot be empty")
    @Size(max = 128, message = "The maximum length allowed for the Table Group name is 128 characters")
    private String name;

    @Size(max = 256, message = "The maximum length allowed for the Table Group Description is 400 characters")
    private String description;

    private Date createdAt;
    private String createdBy;
    private Date lastModifiedAt;
    private String lastModifiedBy;

    private Collection<UserRole> userRole;
}
