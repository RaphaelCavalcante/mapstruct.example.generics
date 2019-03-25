package mapstruct.mapper.base;

import org.mapstruct.Mapping;

public abstract interface MapperBase <Entity, DTO>{
	DTO entityToDTO(Entity entity);
	Entity dtoToEntity(DTO dto);
}
