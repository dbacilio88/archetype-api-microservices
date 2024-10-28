package ${package}.${packageName.replace('/','.')}.components.interfaces;


/**
 * <b>ICrud</b>
 * <p>
 * This class specifies the requirements for the {@link ICrud} component,
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

public interface ICrud<E, I> extends IFindAll<E>, IFindById<E, I>, ISave<E>, IUpdate<E>, IDelete<I> {
}
