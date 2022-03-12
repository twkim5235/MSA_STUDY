package dev.practice.order.domain.order;

import dev.practice.order.domain.order.Order;

public interface OrderReader {
    Order getOrder(String orderToken);
}
