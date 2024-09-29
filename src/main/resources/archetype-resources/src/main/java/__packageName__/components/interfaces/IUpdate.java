package ${package}.${packageName.replace('/','.')}.components.interfaces;


/**
 * IUpdate
 * <p>
 * IUpdate interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author dbacilio88@outllok.es
 * @since 25/09/2024
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
