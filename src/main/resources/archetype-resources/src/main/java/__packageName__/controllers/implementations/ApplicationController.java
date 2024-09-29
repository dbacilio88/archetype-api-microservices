package ${package}.${packageName.replace('/','.')}.controllers.implementations;


import ${package}.${packageName.replace('/','.')}.controllers.contracts.IApplicationController;
import ${package}.${packageName.replace('/','.')}.dtos.ApplicationDto;
import ${package}.${packageName.replace('/','.')}.services.contracts.IApplicationService;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ApplicationController
 * <p>
 * ApplicationController class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author dbacilio88@outllok.es
 * @since 25/09/2024
 */

@Log4j2
@RestController
@RequestMapping
public class ApplicationController implements IApplicationController {

    private final IApplicationService applicationService;

    public ApplicationController(final IApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @Override
    @GetMapping("/all")
    public ResponseEntity<List<ApplicationDto>> findAllExecute() {
        return new ResponseEntity<>(this.applicationService.findAll(), HttpStatus.OK);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<ApplicationDto> findByIdExecute(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(this.applicationService.findById(id), HttpStatus.OK);
    }

    @Override
    @PostMapping
    public ResponseEntity<ApplicationDto> saveExecute(@RequestBody ApplicationDto application) {
        return new ResponseEntity<>(this.applicationService.save(application), HttpStatus.CREATED);
    }

    @Override
    @PutMapping
    public ResponseEntity<ApplicationDto> updateExecute(@RequestBody ApplicationDto application) {
        return new ResponseEntity<>(this.applicationService.update(application), HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteExecute(@PathVariable(name = "id") Long id) {

        return new ResponseEntity<>(this.applicationService.delete(id), HttpStatus.OK);
    }

    @Override
    @GetMapping("/pages")
    public ResponseEntity<Page<ApplicationDto>> pageExecute(
            @RequestParam(
                    name = "page",
                    required = false,
                    defaultValue = "1") String page,
            @RequestParam(name = "size",
                    required = false,
                    defaultValue = "5") String size) {
        log.info("page {}", page);
        log.info("size {}", size);
        return new ResponseEntity<>(this.applicationService.findAll(page, size), HttpStatus.OK);
    }
}
