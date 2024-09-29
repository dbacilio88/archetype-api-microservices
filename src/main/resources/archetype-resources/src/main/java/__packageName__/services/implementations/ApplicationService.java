package ${package}.${packageName.replace('/','.')}.services.implementations;


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
 * ApplicationService
 * <p>
 * ApplicationService class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author dbacilio88@outllok.es
 * @since 25/09/2024
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
            //throw new RuntimeException("not found");
            // TODO lógica para controlar error pendiente.
            return 0;
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
        return this.applicationMapper.toDto(this.applicationRepository.findById(id).orElse(null));
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
            //throw new RuntimeException("not found");
            // TODO lógica para controlar error pendiente.
            return applicationDto;
        }
        BsApplicationEntity entity = result.get();
        entity.setApDescription(applicationDto.getDescription());
        return this.applicationMapper.toDto(this.applicationRepository.save(entity));
    }
}
