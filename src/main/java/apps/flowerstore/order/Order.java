package apps.flowerstore.order;

import java.util.LinkedList;

import apps.flowerstore.delivery.Delivery;
import apps.flowerstore.flower.Item;
import apps.flowerstore.payment.Payment;

public class Order {
    LinkedList<Item> items;
    Payment payment;
    Delivery delivery;
}
