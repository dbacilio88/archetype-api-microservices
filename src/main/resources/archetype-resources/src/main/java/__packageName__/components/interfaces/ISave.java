package ${package}.${packageName.replace('/','.')}.components.interfaces;


/**
 * <b>ISave</b>
 * <p>
 * This class specifies the requirements for the {@link ISave} component,
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

public interface ISave<E> {

    /**
     * Method saves an entity to the database.
     *
     * @param e the entity to save.
     * @return E the entity to save
     */

    E save(E e);
}
