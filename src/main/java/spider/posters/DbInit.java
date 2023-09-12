package spider.posters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import spider.posters.model.Item;
import spider.posters.repository.ItemRepository;
import java.math.BigDecimal;
import java.util.List;

@Configuration
public class DbInit implements CommandLineRunner {

    private final ItemRepository itemRepository;

    @Autowired
    public DbInit(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        itemRepository.saveAll(List.of(
                new Item("Poster 1", new BigDecimal("10.00"), "/posters/spider.jpg"),
                new Item("Poster 2", new BigDecimal("20.00"), "/posters/spider.jpg"),
                new Item("Poster 3", new BigDecimal("30.00"), "/posters/spider.jpg")
        ));
    }
}
