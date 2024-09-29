package ${package}.${packageName.replace('/','.')}.dtos;


import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * ApplicationDto
 * <p>
 * ApplicationDto class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author dbacilio88@outllok.es
 * @since 25/09/2024
 */

@Data
public class ApplicationDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 5384263082978944884L;
    private long id;
    private String uuId;
    private String description;
}
