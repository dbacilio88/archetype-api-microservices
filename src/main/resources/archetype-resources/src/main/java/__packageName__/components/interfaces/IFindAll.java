package ${package}.${packageName.replace('/','.')}.components.interfaces;


import org.springframework.data.domain.Page;

import java.util.List;

/**
 * <b>IFindAll</b>
 * <p>
 * This class specifies the requirements for the {@link IFindAll} component,
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
