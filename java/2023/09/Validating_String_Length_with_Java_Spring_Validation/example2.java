import javax.validation.constraints.Size;

public class User {
    
    @Size(min = 5, max = 10)
    private String username;
    
    // Getter and Setter methods
}
