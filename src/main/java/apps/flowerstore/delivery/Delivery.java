package apps.flowerstore.delivery;

import java.util.List;

import apps.flowerstore.flower.Item;

public interface Delivery {
    void deliver(List<Item> items);
}
