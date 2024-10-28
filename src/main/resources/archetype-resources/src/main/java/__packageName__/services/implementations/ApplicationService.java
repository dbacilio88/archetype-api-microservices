package ${package}.${packageName.replace('/','.')}.services.implementations;

import ${package}.${packageName.replace('/','.')}.components.enums.ResponseCode;
import ${package}.${packageName.replace('/','.')}.components.exceptions.CommonException;
import ${package}.${packageName.replace('/','.')}.components.mappers.IApplicationMapper;
import ${package}.${packageName.replace('/','.')}.dtos.ApplicationDto;
import ${package}.${packageName.replace('/','.')}.repositories.IBsApplicationRepository;
import ${package}.${packageName.replace('/','.')}.repositories.entities.BsApplicationEntity;
import ${package}.${packageName.replace('/','.')}.services.contracts.IApplicationService;


import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * <b>ApplicationService</b>
 * <p>
 * This class specifies the requirements for the {@link ApplicationService} component,
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

@Service
@AllArgsConstructor
public class ApplicationService implements IApplicationService {

    private final IBsApplicationRepository applicationRepository;
    private final IApplicationMapper applicationMapper;

    @Override
    public long delete(Long id) {
        Optional<BsApplicationEntity> result = this.applicationRepository.findById(id);
        if (result.isEmpty()) {
            throw new CommonException("not found entity by id ".concat(String.valueOf(id)), ResponseCode.NOT_FOUND);
        }

        this.applicationRepository.delete(result.get());
        return id;
    }

    @Override
    public List<ApplicationDto> findAll() {
        return this.applicationMapper.toList(this.applicationRepository.findAll());
    }

    @Override
    public Page<ApplicationDto> findAll(String page, String size) {
        Pageable pageable = PageRequest.of(Integer.parseInt(page) - 1, Integer.parseInt(size));
        return this.applicationMapper.toPage(this.applicationRepository.findAll(pageable));
    }


    @Override
    public ApplicationDto findById(Long id) {

        Optional<BsApplicationEntity> result = this.applicationRepository.findById(id);

        if (result.isEmpty()) {
            throw new CommonException("not found entity by id ".concat(String.valueOf(id)), ResponseCode.NOT_FOUND);
        }

        return this.applicationMapper.toDto(result.get());
    }

    @Override
    public ApplicationDto save(ApplicationDto applicationDto) {
        applicationDto.setUuId(UUID.randomUUID().toString());
        BsApplicationEntity entity = this.applicationRepository.save(this.applicationMapper.toEntity(applicationDto));
        return this.applicationMapper.toDto(entity);
    }

    @Override
    public ApplicationDto update(ApplicationDto applicationDto) {
        Optional<BsApplicationEntity> result = this.applicationRepository.findById(applicationDto.getId());
        if (result.isEmpty()) {
            throw new CommonException("not found entity by id ".concat(String.valueOf(applicationDto.getId())), ResponseCode.NOT_FOUND);
        }
        BsApplicationEntity entity = result.get();
        entity.setApDescription(applicationDto.getDescription());
        return this.applicationMapper.toDto(this.applicationRepository.save(entity));
    }
}
