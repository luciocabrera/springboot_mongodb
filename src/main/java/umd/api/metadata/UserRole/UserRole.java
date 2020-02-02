package umd.api.metadata.UserRole;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

@Getter
@Setter
public class UserRole {
    private ObjectId user_id;
    private ObjectId role_id;
}
