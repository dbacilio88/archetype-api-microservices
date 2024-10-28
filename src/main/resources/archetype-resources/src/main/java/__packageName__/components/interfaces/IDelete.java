package ${package}.${packageName.replace('/','.')}.components.interfaces;


/**
 * <b>IDelete</b>
 * <p>
 * This class specifies the requirements for the {@link IDelete} component,
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

public interface IDelete<I> {

    /**
     * Method deletes an entity from the database.
     * @param id the entity to delete
     */
    long delete(I id);
}
