package ${package}.${packageName.replace('/','.')}.components.enums;

import lombok.Getter;

/**
 * <b>ResponseCode</b>
 * <p>
 * This class specifies the requirements for the {@link ResponseCode} component,
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

@Getter
public enum ResponseCode {
    SUCCESS(200),
    CREATED(201),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(404);

    private final int code;

    ResponseCode(int code) {
        this.code = code;
    }
}
