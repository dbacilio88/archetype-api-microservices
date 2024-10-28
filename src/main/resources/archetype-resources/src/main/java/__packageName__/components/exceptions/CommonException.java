package ${package}.${packageName.replace('/','.')}.components.exceptions;

import ${package}.${packageName.replace('/','.')}.components.enums.ResponseCode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serial;

/**
 * <b>CommonException</b>
 * <p>
 * This class specifies the requirements for the {@link CommonException} component,
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
@Data
@EqualsAndHashCode(callSuper = true)
public class CommonException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -4073601817720907622L;

    private ResponseCode responseCode;

    public CommonException() {
        super();
    }

    public CommonException(String message) {
        super(message);
    }

    public CommonException(String message, final ResponseCode responseCode) {
        super(message);
        this.responseCode = responseCode;
    }

}
