package ${package}.${packageName.replace('/','.')}.components.interfaces;


/**
 * <b>IUpdate</b>
 * <p>
 * This class specifies the requirements for the {@link IUpdate} component,
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

public interface IUpdate<E> {

    /**
     * Method updates an existing entity in the database.
     *
     * @param entity The entity with updated data.
     * @return E The updated entity.
     */
    E update(E entity);
}
