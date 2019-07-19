package elma.streetsandpits.service;

import elma.streetsandpits.model.Pit;
import elma.streetsandpits.model.Street;

import java.util.List;

public interface PitService {
    List<Pit> getPitByStreet(Street street);

    void deletePitByID(Integer id);
}
