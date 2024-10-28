package ${package}.${packageName.replace('/','.')}.controllers.contracts;


import ${package}.${packageName.replace('/','.')}.dtos.ApplicationDto;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * <b>IApplicationController</b>
 * <p>
 * This class specifies the requirements for the {@link IApplicationController} component,
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

public interface IApplicationController {

    ResponseEntity<List<ApplicationDto>> findAllExecute();

    ResponseEntity<ApplicationDto> findByIdExecute(Long id);

    ResponseEntity<ApplicationDto> saveExecute(ApplicationDto application);

    ResponseEntity<ApplicationDto> updateExecute(ApplicationDto application);

    ResponseEntity<Long> deleteExecute(Long id);

    ResponseEntity<Page<ApplicationDto>> pageExecute(String page, String size);
}
