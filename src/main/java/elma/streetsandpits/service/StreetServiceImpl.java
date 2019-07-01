package elma.streetsandpits.service;

import elma.streetsandpits.model.Street;
import elma.streetsandpits.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetServiceImpl implements StreetService {

    @Autowired
    private StreetRepository streetRepository;

    @Override
    public void saveStreet(Street street) {
        streetRepository.save(street);
    }

    @Override
    public List<Street> getAllStreets() {
        return streetRepository.findAll();
    }
}
