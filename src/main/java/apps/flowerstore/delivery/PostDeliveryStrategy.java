package apps.flowerstore.delivery;

import java.util.List;

import apps.flowerstore.flower.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class PostDeliveryStrategy implements Delivery{
    private String description;
    @Override
    public void deliver(List<Item> items) {
        System.out.println("delivering items using Post");
    }
}
