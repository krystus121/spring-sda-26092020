package pl.sda.hellospring.converter;

import org.mapstruct.Mapper;
import pl.sda.hellospring.domain.Car;
import pl.sda.hellospring.dto.CarDto;


@Mapper //generuje nam konwerter -> taki który mamy zaimplementowany np na CarConverter...
public interface CarConverterMapStruct extends GenericConverter<Car, CarDto>{
}
