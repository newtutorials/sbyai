import org.hibernate.validator.constraints.Length;

public class Product {
    
    @Length(min = 3)
    private String name;
    
    // Getter and Setter methods
}
