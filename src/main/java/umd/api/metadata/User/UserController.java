package umd.api.metadata.User;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity<?> saveOrUpdateUser(@Valid @RequestBody User user, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>(result.getAllErrors(), HttpStatus.BAD_REQUEST);
        } else {
            User user_ = userService.saveOrUpdateUser(user);
            return new ResponseEntity<>(user_, HttpStatus.CREATED);
        }

    }

    @GetMapping("/all")
    public Iterable<User> findAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> findUserById(@PathVariable ObjectId userId) {
        Optional<User> user = userService.findById(userId);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }


}
