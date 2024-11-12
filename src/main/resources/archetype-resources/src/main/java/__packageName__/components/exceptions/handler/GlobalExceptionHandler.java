package ${package}.${packageName.replace('/','.')}.components.exceptions.handler;

import ${package}.${packageName.replace('/','.')}.components.exceptions.CommonException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>GlobalExceptionHandler</b>
 * <p>
 * This class specifies the requirements for the {@link GlobalExceptionHandler} component,
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
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CommonException.class)
    public ResponseEntity<?> exceptionHandler(final CommonException exception) {
        Map<String, Object> body = new HashMap<>();
        body.put("message", exception.getMessage());
        body.put("error", HttpStatus.valueOf(exception.getResponseCode().getCode()));
        return ResponseEntity.status(exception.getResponseCode().getCode())
                .contentType(MediaType.APPLICATION_JSON)
                .body(body);

    }
}
