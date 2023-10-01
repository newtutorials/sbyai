import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestController
@Validated
public class UserController {

    @PostMapping("/users")
    public String createUser(@RequestBody @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // Logic to handle validation errors
            return "Validation failed";
        } else {
            // Logic to create user
            return "User created successfully";
        }
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationException(MethodArgumentNotValidException ex) {
        // Logic to handle validation exceptions
        return ResponseEntity.badRequest().body("Validation failed");
    }
}
