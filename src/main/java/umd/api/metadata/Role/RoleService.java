package umd.api.metadata.Role;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Role saveOrUpdateRole(Role role) {
        return roleRepository.save(role);
    }

    public Collection<Role> saveOrUpdateAllRoles(Collection<Role> roles){return roleRepository.saveAll(roles);}

    public Collection<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    public Optional<Role> findById(String roleId) {
        return roleRepository.findById(roleId);
    }
}

