package elma.streetsandpits.service;

import elma.streetsandpits.model.Pit;
import elma.streetsandpits.model.Street;
import elma.streetsandpits.repository.PitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("")
public class PitServiceImpl implements PitService {

    @Autowired
    private PitRepository pitRepository;

    @Override
    public List<Pit> getPitByStreet(Street street) {
        return null;
    }

    @Override
    public void addPit(Pit pit) {
pitRepository.save(pit);
    }
}
