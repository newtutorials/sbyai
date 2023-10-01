import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParsingExample {
  public static void main(String[] args) {
    String jsonString = "{\"name\": \"John\", \"age\": 30}";
    try {
      JsonNode jsonNode = new ObjectMapper().readTree(jsonString);
      String name = jsonNode.get("name").asText();
      System.out.println("Name: " + name);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
