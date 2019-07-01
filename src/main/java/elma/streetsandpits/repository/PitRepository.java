package elma.streetsandpits.repository;

import elma.streetsandpits.model.Pit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PitRepository extends JpaRepository<Pit,Integer> {
}
