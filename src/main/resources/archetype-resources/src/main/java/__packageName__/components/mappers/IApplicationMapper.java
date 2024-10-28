package ${package}.${packageName.replace('/','.')}.components.mappers;


import ${package}.${packageName.replace('/','.')}.dtos.ApplicationDto;
import ${package}.${packageName.replace('/','.')}.repositories.entities.BsApplicationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.List;

/**
 * <b>IApplicationMapper</b>
 * <p>
 * This class specifies the requirements for the {@link IApplicationMapper} component,
 * developed in accordance with the development standards established by bxcode.
 * Collaboration is encouraged for the enhancement and expansion of the archetype-example.
 * </p>
 * <p>
 * <b>Usage:</b>
 * description here!
 * </p>
 *
 * @author bxcode
 * @author dbacilio88@outllok.es
 * @since 28/10/2024
 */

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface IApplicationMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "apDescription", source = "description")
    BsApplicationEntity toEntity(ApplicationDto dto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "description", source = "apDescription")
    ApplicationDto toDto(BsApplicationEntity entity);

    List<ApplicationDto> toList(Iterable<BsApplicationEntity> entities);

    default Page<ApplicationDto> toPage(Page<BsApplicationEntity> entities) {
        List<ApplicationDto> list = entities.getContent()
                .stream()
                .map(this::toDto)
                .toList();
        return new PageImpl<>(list, entities.getPageable(), entities.getTotalElements());
    }

}
