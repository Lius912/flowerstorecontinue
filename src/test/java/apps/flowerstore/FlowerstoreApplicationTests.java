package apps.flowerstore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import apps.flowerstore.payment.*;
import apps.flowerstore.delivery.*;
import apps.flowerstore.flower.Item;
import apps.flowerstore.order.Order;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest @TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FlowerstoreApplicationTests {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeAll
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@AfterAll
	public void restoreStreams() {
		System.setOut(originalOut);
	}

    @AfterEach
    public void clearStreams() {
        outContent.reset();
    }

    @Test
    public void PayPalPaymentTest() {
        Payment payment = new PayPalPaymentStrategy("4343-4343-4343-4343");
        payment.pay(2323);
        assertEquals("paying using PayPal\n", outContent.toString());
    }

    @Test
    public void CreditCartPaymentTest() {
        Payment payment = new CreditCartPaymentStrategy("4343-4343-4343-4343");
        payment.pay(2323);
        assertEquals("paying using Credit Cart\n", outContent.toString());
    }

    @Test
    public void DHLDeliveryTest() {
        Delivery delivery = new DHLDeliveryStrategy("some address");
        delivery.deliver(new ArrayList<Item>());
        assertEquals("delivering items using DHL\n", outContent.toString());
    }

    @Test
    public void PostDeliveryTest() {
        Delivery delivery = new PostDeliveryStrategy("some address");
        delivery.deliver(new ArrayList<Item>());
        assertEquals("delivering items using Post\n", outContent.toString());
    }

    @Test
    public void OrderProcessingTest() {
        Order order = new Order();
        order.processOrder();
        assertEquals("processing order\n", outContent.toString());
    }
}
