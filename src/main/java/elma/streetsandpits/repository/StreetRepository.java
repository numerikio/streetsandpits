package elma.streetsandpits.repository;

import elma.streetsandpits.model.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetRepository extends JpaRepository<Street,Integer> {
}
