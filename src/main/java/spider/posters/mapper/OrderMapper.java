package spider.posters.mapper;

import spider.posters.Cart;
import spider.posters.CartItem;
import spider.posters.dto.OrderDto;
import spider.posters.model.order.Order;
import spider.posters.model.order.OrderItem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderMapper {

    public static Order mapToOrder(OrderDto orderDto) {
        return Order.builder()
                .firstName(orderDto.getFirstName())
                .lastName(orderDto.getLastName())
                .address(orderDto.getAddress())
                .postCode(orderDto.getPostCode())
                .city(orderDto.getCity())
                .created(LocalDateTime.now())
                .build();
    }

    public static List<OrderItem> mapToOrderItemList(Cart cart, Order order) {
        List<OrderItem> orderItems = new ArrayList<>();
        for(CartItem ci : cart.getCartItems()) {
            orderItems.add(new OrderItem(order.getOrderId(),
                    ci.getItem().getId(),
                    ci.getCounter()));
        }
        return orderItems;
    }
}
