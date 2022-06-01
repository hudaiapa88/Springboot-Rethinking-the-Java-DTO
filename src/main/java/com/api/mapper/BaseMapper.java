package com.api.mapper;

import com.api.model.entity.User;
import org.mapstruct.IterableMapping;
import org.mapstruct.Named;
import java.util.List;

public interface BaseMapper<Dto,Entity> {

    @Named("dtoToEntity")
    Entity dtoToEntity(Dto dto);

    @Named("entityToDto")
    Dto entityToDto(Entity entity);

    @IterableMapping(qualifiedByName = "entityToDto")
    List<Dto> entityListToDtoList(List<Entity> entityList);

    @IterableMapping(qualifiedByName = "dtoToEntity")
    List<Entity> dtoListToEntityList(List<Dto> dtoList);

}
