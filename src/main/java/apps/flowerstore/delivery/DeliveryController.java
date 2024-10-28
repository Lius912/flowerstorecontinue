package apps.flowerstore.delivery;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {
    @GetMapping("delivery")
    public List<Delivery> getPayments(){
        return List.of(new DHLDeliveryStrategy("some address"));
    }
}
