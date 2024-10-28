package ${package}.${packageName.replace('/','.')}.dtos;


import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * <b>ApplicationDto</b>
 * <p>
 * This class specifies the requirements for the {@link ApplicationDto} component,
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
public class ApplicationDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 5384263082978944884L;
    private long id;
    private String uuId;
    private String description;
}
