import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class UserController {

    @PostMapping("/users")
    public String createUser(@RequestBody @Valid User user) {
        // Logic to create user
        return "User created successfully";
    }
}
