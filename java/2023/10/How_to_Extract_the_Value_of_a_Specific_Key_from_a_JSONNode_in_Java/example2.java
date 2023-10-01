String jsonString = "{\"name\": \"John\", \"age\": 30}";
JsonNode jsonNode = new ObjectMapper().readTree(jsonString);
