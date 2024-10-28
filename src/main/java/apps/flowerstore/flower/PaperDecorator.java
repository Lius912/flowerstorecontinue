package apps.flowerstore.flower;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaperDecorator extends ItemDecorator {
    private Item item;

    public String getDescription() {
        return "Paper decorator";
    }

    public double getPrice() {
        return 13 + item.price();
    }

    public double price() {
        return getPrice();
    }
}