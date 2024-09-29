package ${package}.${packageName.replace('/','.')}.components.interfaces;


/**
 * ISave
 * <p>
 * ISave interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author dbacilio88@outllok.es
 * @since 25/09/2024
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
