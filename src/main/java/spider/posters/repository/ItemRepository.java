package spider.posters.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spider.posters.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
