package apps.flowerstore.flower;

import java.util.ArrayList;
import java.util.List;


public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void addFlowers(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        return flowerPacks
                        .stream()
                        .map(x -> x.getPrice())
                        .reduce(0.0, (a, b) -> a + b);
    }

    public double price() {
        return getPrice();
    }
}
