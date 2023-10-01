public class Order {
    private String id;
    private OrderStatus status;
    // other fields, constructors, getters/setters
}

public enum OrderStatus {
    NEW, PROCESSING, COMPLETED, CANCELLED
}

public class OrderDto {
    private String id;
    private String status;
    // other fields, constructors, getters/setters
}
