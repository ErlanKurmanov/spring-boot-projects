package com.example.dream_shop_connectingsql.service.order;


import com.example.dream_shop_connectingsql.dto.OrderDto;
import com.example.dream_shop_connectingsql.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
