package umd.api.metadata.Role;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Document(collection = "roles")
public class Role {
    @Id
    private String _id;
    @Indexed(name = "role_name_index", unique = true, direction = IndexDirection.ASCENDING)
    private String name;

    private List<Privilege> privileges;


    private Date createdAt;
    private String createdBy;
    private Date lastModifiedAt;
    private String lastModifiedBy;

    public Role(){
        this.createdAt = new Date();
        this.lastModifiedAt = new Date();
    }


}
