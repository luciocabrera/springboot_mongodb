package umd.api.metadata.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/add")
    public ResponseEntity<?> saveOrUpdateRole(@Valid @RequestBody Role role, BindingResult result) {
        Role role_ = roleService.saveOrUpdateRole(role);
        return new ResponseEntity<>(role_, HttpStatus.CREATED);
    }

    @PostMapping("/saveAll")
    public ResponseEntity<?> saveOrUpdateAllRoles(@Valid @RequestBody Collection<Role> roles, BindingResult result) {
        Collection<Role> roles_ = roleService.saveOrUpdateAllRoles(roles);
        return new ResponseEntity<>(roles_, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public Collection<Role> findAllTableGroups() {
        return roleService.findAllRoles();
    }

    @GetMapping("/{roleId}")
    public ResponseEntity<?> findRoleById(@PathVariable String roleId) {
        Optional<Role> role = roleService.findById(roleId);
        return new ResponseEntity<>(role, HttpStatus.OK);
    }
}
