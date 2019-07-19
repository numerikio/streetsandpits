package elma.streetsandpits.service;

import elma.streetsandpits.model.Pit;
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
    public Street saveStreet(Street street) {
        Street newStreet = new Street();
        newStreet.setName(street.getName());
        streetRepository.save(newStreet);
        return newStreet;
    }

    @Override
    public List<Street> getAllStreets() {
        return streetRepository.findAll();
    }

    @Override
    public Street getSreetById(Integer id) {
        return streetRepository.getOne(id);
    }

    @Override
    public Street addPit(Integer id) {
        Street street = streetRepository.getOne(id);
        Pit pit = new Pit();
        pit.setStreet(street);
        street.getPitList().add(pit);
        streetRepository.save(street);
        return street;
    }
}
