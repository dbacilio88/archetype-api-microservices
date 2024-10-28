package ${package}.${packageName.replace('/','.')}.repositories;

import ${package}.${packageName.replace('/','.')}.repositories.entities.BsApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * <b>IBsApplicationRepository</b>
 * <p>
 * This class specifies the requirements for the {@link IBsApplicationRepository} component,
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

@Repository
public interface IBsApplicationRepository extends JpaRepository<BsApplicationEntity, Long>, JpaSpecificationExecutor<BsApplicationEntity> {
}