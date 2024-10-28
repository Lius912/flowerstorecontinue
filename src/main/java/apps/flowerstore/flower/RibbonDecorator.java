package apps.flowerstore.flower;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RibbonDecorator extends ItemDecorator {
    private Item item;

    public String getDescription() {
        return "Ribbon decorator";
    }

    public double getPrice() {
        return 40 + item.price();
    }

    public double price() {
        return getPrice();
    }
}
