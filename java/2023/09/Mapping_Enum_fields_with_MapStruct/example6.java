Order order = new Order("123", OrderStatus.COMPLETED);
OrderDto orderDto = OrderMapper.INSTANCE.orderToDto(order);
System.out.println(orderDto.getStatus()); // Output: "COMPLETED"
