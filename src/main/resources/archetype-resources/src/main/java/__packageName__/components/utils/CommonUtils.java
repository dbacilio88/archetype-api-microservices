package ${package}.${packageName.replace('/','.')}.components.utils;


import java.util.Objects;

/**
 * <b>CommonUtils</b>
 * <p>
 * This class specifies the requirements for the {@link CommonUtils} component,
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

public class CommonUtils {

    private static final Long ID_ZERO_VALUE = 0L;

    public static boolean isValidateId(final Long id) {
        if (Objects.isNull(id) || ID_ZERO_VALUE.equals(id)) {
            return false;
        }

        return id > ID_ZERO_VALUE;
    }

}
