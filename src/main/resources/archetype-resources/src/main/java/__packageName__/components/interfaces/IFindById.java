package ${package}.${packageName.replace('/','.')}.components.interfaces;


/**
 * <b>IFindById</b>
 * <p>
 * This class specifies the requirements for the {@link IFindById} component,
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

public interface IFindById<E, I> {

    /**
     * @param id The identifier of the entity to find.
     * @return E The found entity, or null if not found.
     */
    E findById(I id);
}
