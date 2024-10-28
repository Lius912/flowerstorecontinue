package apps.flowerstore.flower;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BasketDecorator extends ItemDecorator {
    private Item item;

    public String getDescription() {
        return "Basket decorator";
    }

    public double getPrice() {
        return 4 + item.price();
    }

    public double price() {
        return getPrice();
    }
}
