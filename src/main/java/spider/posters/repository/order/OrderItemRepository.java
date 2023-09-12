package spider.posters.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;
import spider.posters.model.order.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
