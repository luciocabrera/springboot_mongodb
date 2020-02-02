package umd.api.metadata.User;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@ToString
@Document(collection = "users")
public class User {
    @Id
    private ObjectId id;
    @Indexed(name = "user_name_index", unique = true, direction = IndexDirection.ASCENDING)
    @NotNull(message = "The User Name cannot be null")
    private String name;
    @NotBlank(message = "The User Email cannot be blank")
    private String email;

    private Date createdAt;
    private String createdBy;
    private Date lastModifiedAt;
    private String lastModifiedBy;

}
