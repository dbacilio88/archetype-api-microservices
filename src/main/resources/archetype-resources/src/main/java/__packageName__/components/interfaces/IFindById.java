package ${package}.${packageName.replace('/','.')}.components.interfaces;


/**
 * IFindById
 * <p>
 * IFindById interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author dbacilio88@outllok.es
 * @since 25/09/2024
 */

public interface IFindById<E, I> {

    /**
     * @param id The identifier of the entity to find.
     * @return E The found entity, or null if not found.
     */
    E findById(I id);
}
