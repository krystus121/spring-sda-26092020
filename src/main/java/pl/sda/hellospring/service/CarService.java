package pl.sda.hellospring.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.hellospring.converter.CarConverter;
import pl.sda.hellospring.domain.Car;
import pl.sda.hellospring.dto.CarDto;
import pl.sda.hellospring.repository.CarRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service //komponent który dostarcza nam logikę
@Slf4j // logowanie

public class CarService {

    private final CarRepository carRepository;
    private final CarConverter carConverter;

    //jak jest jeden konstruktor to nie trzeba mu wskazywać autowired...
    public CarService(CarRepository carRepository, CarConverter carConverter) {
        this.carRepository = carRepository;
        this.carConverter = carConverter;
    }

    public List<CarDto> getAllCars(){
        List<CarDto> result = new ArrayList<CarDto>();
        var dataFromRepository = new ArrayList<Car>();
        carRepository.findAll()
                .forEach(car -> dataFromRepository.add(car));

        result = dataFromRepository.stream()
                .map(car -> carConverter.fromEntityToDto(car))
                .collect(Collectors.toList());
        return result;
    }


    public CarDto findCarById(Long carId) {
        var result = carRepository.findById(carId)
                .map(car -> carConverter.fromEntityToDto(car))
                .orElse(CarDto.builder().build());
        log.info( "Object after conversion ",result);
        return result;
    }
}
