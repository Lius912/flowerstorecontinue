package apps.flowerstore.payment;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @GetMapping("payment")
    public List<Payment> getPayments(){
        return List.of(new PayPalPaymentStrategy("4409-1223-1232-4434"));
    }
}
