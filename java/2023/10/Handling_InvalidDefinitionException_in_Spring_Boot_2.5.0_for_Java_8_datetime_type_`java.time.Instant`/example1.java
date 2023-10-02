import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.time.Instant;

@Configuration
public class JacksonConfig {
   @Bean
   public ObjectMapper objectMapper() {
      ObjectMapper objectMapper = new ObjectMapper();
      SimpleModule module = new SimpleModule();
      module.addSerializer(Instant.class, new CustomInstantSerializer());
      module.addDeserializer(Instant.class, new CustomInstantDeserializer());
      objectMapper.registerModule(module);
      return objectMapper;
   }

   // Define your custom serializer and deserializer for Instant type here
   //...
}
