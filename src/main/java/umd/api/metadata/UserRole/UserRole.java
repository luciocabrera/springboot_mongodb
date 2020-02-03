package umd.api.metadata.UserRole;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import umd.api.metadata.Role.Role;
import umd.api.metadata.User.User;

@Getter
@Setter
public class UserRole {
    private String user_id;
    private String role_id;

//    @DBRef
//    private User user;
//    @DBRef
//    private Role role;
}
