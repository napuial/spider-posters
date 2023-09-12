package spider.posters.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spider.posters.model.order.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
