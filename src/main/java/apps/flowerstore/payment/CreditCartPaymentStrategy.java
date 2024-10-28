package apps.flowerstore.payment;

import java.util.List;

import apps.flowerstore.flower.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class CreditCartPaymentStrategy implements Payment {
    private String description;
    @Override
    public void pay(double price) {
        return;
    }
}
