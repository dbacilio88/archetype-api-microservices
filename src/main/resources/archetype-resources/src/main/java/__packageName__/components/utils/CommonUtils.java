package ${package}.${packageName.replace('/','.')}.components.utils;


import java.util.Objects;

/**
 * CommonUtils
 * <p>
 * CommonUtils class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author dbacilio88@outllok.es
 * @since 25/09/2024
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
