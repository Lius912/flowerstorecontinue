package apps.flowerstore.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class CreditCartPaymentStrategy implements Payment {
    private String description;
    @Override
    public void pay(double price) {
        System.out.println("paying using Credit Cart");
    }
}
