package mapstruct.concrete.mapper;

import org.mapstruct.Mapper;

import mapstruct.concrete.dto.CarDTO;
import mapstruct.concrete.entity.Car;
import mapstruct.example.generic.MapperBase;

@Mapper
public interface CarMapper extends MapperBase<Car, CarDTO>{

}
