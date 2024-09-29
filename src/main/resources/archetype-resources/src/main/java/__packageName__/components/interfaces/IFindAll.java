package ${package}.${packageName.replace('/','.')}.components.interfaces;


import org.springframework.data.domain.Page;

import java.util.List;

/**
 * IFindAll
 * <p>
 * IFindAll interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author dbacilio88@outllok.es
 * @since 25/09/2024
 */

public interface IFindAll<E> {

    /**
     * Method retrieves a list of all entities of a specific type.
     *
     * @return List<E> A list of entities of the specified type.
     */
    List<E> findAll();

    /**
     * Method retrieves a list of all entities of a specific type with pagination.
     *
     * @param page Pagination information, including page number and size.
     * @param size Pagination information, including page number and size.
     * @return Page<E>  A page of entities of the specified type.
     */

    Page<E> findAll(String page, String size);
}
