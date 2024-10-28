package apps.flowerstore.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class PayPalPaymentStrategy implements Payment {
    private String description;
    @Override
    public void pay(double price) {
        System.out.println("paying using PayPal");
    }
}
