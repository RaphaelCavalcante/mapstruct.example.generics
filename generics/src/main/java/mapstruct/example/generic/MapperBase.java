package mapstruct.example.generic;

public abstract interface MapperBase <Entity, DTO>{
	Entity dtoToEntity(DTO dto);
	DTO entityToDTO(Entity entity);
}
