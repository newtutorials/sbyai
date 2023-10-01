Yaml yaml = new Yaml();
InputStream inputStream = new FileInputStream("config.yaml");
Map<String, Object> data = yaml.load(inputStream);

int port = (int) data.get("server.port");
String host = (String) data.get("server.host");

System.out.println("Port: " + port);
System.out.println("Host: " + host);
