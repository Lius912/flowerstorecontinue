package apps.flowerstore.order;

import java.util.LinkedList;

import apps.flowerstore.delivery.Delivery;
import apps.flowerstore.flower.Item;
import apps.flowerstore.payment.Payment;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Order {
    LinkedList<Item> items;
    Payment payment;
    Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double sum = 0;
        for (Item item: items) {
            sum += item.price();
        }
        return sum;
    }

    public void processOrder() {
        System.out.println("processing order");
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
