import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.Instant;

public class MyEntity {
   @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
   private Instant timestamp;

   // Getters and setters
}
