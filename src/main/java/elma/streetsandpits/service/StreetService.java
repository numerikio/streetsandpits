package elma.streetsandpits.service;

import elma.streetsandpits.model.Street;

import java.util.List;
import java.util.Optional;

public interface StreetService {
    Street saveStreet(Street street);
    List<Street>getAllStreets();
    Street getSreetById (Integer id);
    Street addPit (Integer id);
}
