package mapstruct.mapper;

import org.mapstruct.Mapper;

import mapstruct.dto.CarDTO;
import mapstruct.entity.Car;
import mapstruct.mapper.base.MapperBase;
@Mapper
public interface CarMapper extends MapperBase<Car, CarDTO>{

}
