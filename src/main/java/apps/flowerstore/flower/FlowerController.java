package apps.flowerstore.flower;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="flower")
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers() {
		return List.of(new Flower(2, FlowerColor.BLUE, 30, FlowerType.CHAMOMILE));
    }
}
