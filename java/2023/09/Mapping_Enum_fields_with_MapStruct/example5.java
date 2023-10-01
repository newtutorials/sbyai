@Mappings({
    @Mapping(source = "status", target = "status", qualifiedByName = "toString")
})
OrderDto orderToDto(Order order);

@Named("toString")
default String orderStatusToString(OrderStatus orderStatus) {
    return orderStatus.toString();
}
