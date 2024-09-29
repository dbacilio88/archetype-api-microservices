package ${package}.${packageName.replace('/','.')}.components.interfaces;


/**
 * IDelete
 * <p>
 * IDelete interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author dbacilio88@outllok.es
 * @since 25/09/2024
 */

public interface IDelete<I> {

    /**
     * Method deletes an entity from the database.
     * @param id the entity to delete
     */
    long delete(I id);
}
