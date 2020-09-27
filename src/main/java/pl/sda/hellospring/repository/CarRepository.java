package pl.sda.hellospring.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.hellospring.domain.Car;

import java.util.Optional;


//interface CRUD repository - umożliwia nam pobranie obiektu klasy po wybranych przez nas parametrach
//do tego celu używamy metodki finBy i ona nam podpowiada na podstawie kolumn...
                                                    //<obietk mapowany, jegoId>
public interface CarRepository extends CrudRepository<Car, Long> {
    Optional<Car> findByBrandAfterAndColor(String brand, String color); //findBY odnosi się do SQLa
}
