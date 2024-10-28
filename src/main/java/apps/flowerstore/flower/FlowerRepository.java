package apps.flowerstore.flower;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long> {
    
}
