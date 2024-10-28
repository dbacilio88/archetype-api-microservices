package ${package}.${packageName.replace('/','.')}.services.contracts;


import ${package}.${packageName.replace('/','.')}.components.interfaces.ICrud;
import ${package}.${packageName.replace('/','.')}.dtos.ApplicationDto;

/**
 * <b>IApplicationService</b>
 * <p>
 * This class specifies the requirements for the {@link IApplicationService} component,
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

public interface IApplicationService extends ICrud<ApplicationDto, Long> {
}
