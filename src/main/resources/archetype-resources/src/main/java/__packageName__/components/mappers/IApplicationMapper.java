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
 * IApplicationMapper
 * <p>
 * IApplicationMapper interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author dbacilio88@outllok.es
 * @since 25/09/2024
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
