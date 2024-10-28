package apps.flowerstore.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class Flower extends Item{
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    public double price() {
        return getPrice();
    }
}
