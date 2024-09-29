package ${package}.${packageName.replace('/','.')}.controllers.contracts;


import ${package}.${packageName.replace('/','.')}.dtos.ApplicationDto;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * IApplicationController
 * <p>
 * IApplicationController interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author dbacilio88@outllok.es
 * @since 25/09/2024
 */

public interface IApplicationController {

    ResponseEntity<List<ApplicationDto>> findAllExecute();

    ResponseEntity<ApplicationDto> findByIdExecute(Long id);

    ResponseEntity<ApplicationDto> saveExecute(ApplicationDto application);

    ResponseEntity<ApplicationDto> updateExecute(ApplicationDto application);

    ResponseEntity<Long> deleteExecute(Long id);

    ResponseEntity<Page<ApplicationDto>> pageExecute(String page, String size);
}
